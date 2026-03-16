package atividade_pratica.parte_05;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import atividade_pratica.BaseQuestoes;

public class Questao_10 extends BaseQuestoes {

    @Override
    public void executar() {
        String codigo = "float valor == num1 + ( num2 * 10 ) ;";
        System.out.println("Codigo analisado: " + codigo);

        Map<String, String> tokens = new HashMap<>();

        tokens.put("PALAVRA_RESERVADA", "\\b(float|int)\\b");
        tokens.put("NÚMERO", "\\b([0-9]|[1-9][0-9])\\b");
        tokens.put("IDENTIFICADOR", "\\b(?!float|int)[a-zA-Z_][a-zA-Z0-9_]*\\b");
        tokens.put("OPERADOR", "[+\\-\\*/=!<>][=]*");
        tokens.put("DELIMITADOR", "[;()]");

        String[] partes = codigo.split("\\s+");

        for (String parte : partes) {
            boolean encontrado = false;
            for (Map.Entry<String, String> token : tokens.entrySet()) {
                Pattern pattern = Pattern.compile(token.getValue());
                Matcher match = pattern.matcher(parte);
                if (match.matches()) {
                    System.out.println(token.getKey() + " => " + parte);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("TOKEN NÃO ENCONTRADO => " + parte);
            }
        }
    }

}
