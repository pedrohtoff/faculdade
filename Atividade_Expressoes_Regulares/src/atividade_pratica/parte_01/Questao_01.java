package atividade_pratica.parte_01;

import atividade_pratica.BaseQuestoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao_01 extends BaseQuestoes {

    @Override
    public void executar() {
        String texto = "12a45";
        String regex = "\\b[0-9]+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matches = pattern.matcher(texto);

        System.out.println("String analisada: " + texto);
        if (matches.find()) {
            System.out.println("A string contém apenas números!!!");
        } else {
            System.out.println("A string não contém apenas números!");
        }

    }
}