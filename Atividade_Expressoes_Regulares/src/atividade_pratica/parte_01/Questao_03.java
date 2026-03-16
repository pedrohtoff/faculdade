package atividade_pratica.parte_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import atividade_pratica.BaseQuestoes;

public class Questao_03 extends BaseQuestoes {
    @Override
    public void executar() {
        String texto = "15/03/2025";
        String regex = "\\b[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}\\b";
        System.out.println("String analisada: " + texto);

        Pattern pattern = Pattern.compile(regex);
        Matcher matches = pattern.matcher(texto);

        if (matches.find()) {
            System.out.println("Data encontrada no formato: " + matches.group());
        } else {
            System.out.println("Nenhuma data encontrada no formato DD/MM/AAAA");
        }
    }

}