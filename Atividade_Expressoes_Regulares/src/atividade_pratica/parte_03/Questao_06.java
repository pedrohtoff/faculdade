package atividade_pratica.parte_03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import atividade_pratica.BaseQuestoes;

public class Questao_06 extends BaseQuestoes {

    @Override
    public void executar() {
        String texto = "25/10/2024";
        String regex = "\\b([0-9]{2})\\/([0-9]{2})\\/([0-9]{4})\\b";
        System.out.println("String analisada: " + texto);

        Pattern pattern = Pattern.compile(regex);
        Matcher matches = pattern.matcher(texto);

        if (matches.find()) {
            System.out.println("Data encontrada: ");
            System.out.println("Dia: " + matches.group(1));
            System.out.println("Mês: " + matches.group(2));
            System.out.println("Ano: " + matches.group(3));
        }
    }

}