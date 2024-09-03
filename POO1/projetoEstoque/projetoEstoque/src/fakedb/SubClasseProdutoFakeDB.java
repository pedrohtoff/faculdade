package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import domain.SubClasseProduto;

public class SubClasseProdutoFakeDB extends BaseFakeDB<SubClasseProduto> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<SubClasseProduto>();
        tabela.add(new SubClasseProduto(1, "Bovino", LocalDate.now(), 1));
        tabela.add(new SubClasseProduto(2, "Suino", LocalDate.now(), 1));
        tabela.add(new SubClasseProduto(3, "Refrigerante", LocalDate.now(), 2));
        tabela.add(new SubClasseProduto(4, "Suco", LocalDate.now(), 2));
        tabela.add(new SubClasseProduto(5, "Iogurtes", LocalDate.now(), 3));
        tabela.add(new SubClasseProduto(6, "Leites", LocalDate.now(), 3));
    }

    public SubClasseProdutoFakeDB() {
        super();
    }
}
