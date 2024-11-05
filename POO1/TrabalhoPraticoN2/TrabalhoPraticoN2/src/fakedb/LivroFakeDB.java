package fakedb;

import java.util.ArrayList;

import dominio.Livro;

public class LivroFakeDB extends BaseFakeDB<Livro> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<Livro>();
        // ISBN é aleatório e não corresponde aos livros
        this.tabela.add(new Livro(1, "Tartarugas até lá Embaixo", "John Green", "123455", 2017));
        this.tabela.add(new Livro(2, "O Iluminado", "Stephen King", "123456", 1977));
        this.tabela.add(new Livro(3, "A Menina que Roubava Livros", " Markus Zusak", "123457", 2005));
        this.tabela.add(new Livro(4, "O Menino do pijama listrado", "John Boyne", "123458", 2006));
        this.tabela.add(new Livro(5, "O Cemitério", "Stephen King", "123459", 1983));
    }

    public LivroFakeDB() {
        super();
    }
}
