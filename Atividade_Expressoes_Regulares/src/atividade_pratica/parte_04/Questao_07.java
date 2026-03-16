package atividade_pratica.parte_04;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import atividade_pratica.BaseQuestoes;

public class Questao_07 extends BaseQuestoes {

    @Override
    public void executar() {
        String texto = "CPF: 123.456.789-00";
        String regex = "\\b([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matches = pattern.matcher(texto);

        String resultado = matches.replaceAll("***.***.***-$4");
        System.out.print("Texto Original: ");
        System.out.println(texto);
        System.out.print("Texto Mascarado: ");
        System.out.println(resultado);
    }
}