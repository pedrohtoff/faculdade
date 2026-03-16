package atividade_pratica.parte_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import atividade_pratica.BaseQuestoes;

public class Questao_05 extends BaseQuestoes {

    @Override
    public void executar() {
        String texto = "Maria tem 23 anos e comprou 5 livros por 120 reais.";
        String regex = "\\d{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matches = pattern.matcher(texto);

        System.out.println("String analisada: " + texto);
        while (matches.find()) {
            System.out.print("Numero encontrado: ");
            System.out.println(matches.group());
        }
    }

}