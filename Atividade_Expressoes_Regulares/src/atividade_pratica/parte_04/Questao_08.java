package atividade_pratica.parte_04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import atividade_pratica.BaseQuestoes;

public class Questao_08 extends BaseQuestoes {

    @Override
    public void executar() {
        String texto = "Telefone: (67) 99876-1234";
        String regex = "\\(([0-9]{2})\\)\\s([0-9]{1})([0-9]{4})\\-([0-9]{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matches = pattern.matcher(texto);

        String resultado = matches.replaceAll("($1) $2****-$4");

        System.out.print("Texto Original: ");
        System.out.println(texto);
        System.out.print("Texto Mascarado: ");
        System.out.println(resultado);
    }

}