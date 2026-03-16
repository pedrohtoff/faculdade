package atividade_pratica.parte_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import atividade_pratica.BaseQuestoes;

public class Questao_02 extends BaseQuestoes {

    @Override
    public void executar() {
        String texto = "10.5,3.14,0.99";
        String regex = "\\b[0-9]+[\\.][0-9]+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matches = pattern.matcher(texto);

        System.out.println("String analisada: " + texto);

        while (matches.find()) {
            System.out.print("Numero decimal encontrado: ");
            System.out.println(matches.group());
        }
    }

}
