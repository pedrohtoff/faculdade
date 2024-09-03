package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import domain.ClasseProduto;

public class ClasseProdutoFakeDB extends BaseFakeDB<ClasseProduto> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<ClasseProduto>();
        this.tabela.add(new ClasseProduto(1, "Carnes", LocalDate.now()));
        this.tabela.add(new ClasseProduto(2, "Bebidas", LocalDate.now()));
        this.tabela.add(new ClasseProduto(3, "Laticíonios", LocalDate.now()));
    }

    public ClasseProdutoFakeDB() {
        super();
    }
}
