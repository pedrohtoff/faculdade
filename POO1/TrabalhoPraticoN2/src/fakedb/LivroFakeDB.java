package fakedb;

import java.util.ArrayList;

import dominio.Livro;

public class LivroFakeDB extends BaseFakeDB<Livro> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<Livro>();
        this.tabela.add(new Livro(1, "SEILA1", "pedro1", "123455", 2015));
        this.tabela.add(new Livro(2, "SEILA2", "pedro2", "123456", 2016));
        this.tabela.add(new Livro(3, "SEILA3", "pedro3", "123457", 2017));
        this.tabela.add(new Livro(4, "SEILA4", "pedro4", "123458", 2018));
        this.tabela.add(new Livro(5, "SEILA5", "pedro5", "123459", 2019));
    }

    public LivroFakeDB() {
        super();
    }
}
