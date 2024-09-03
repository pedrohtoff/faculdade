package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import domain.Produto;

public class ProdutoFakeDB extends BaseFakeDB<Produto> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<Produto>();
        this.tabela.add(new Produto(1, "Maminha", LocalDate.now(), 1, 32.99));
        this.tabela.add(new Produto(2, "Filé", LocalDate.now(), 1, 32.99));
        this.tabela.add(new Produto(3, "Bisteca", LocalDate.now(), 2, 32.99));
        this.tabela.add(new Produto(4, "Bacon", LocalDate.now(), 2, 32.99));
        this.tabela.add(new Produto(5, "Pepsi", LocalDate.now(), 3, 32.99));
        this.tabela.add(new Produto(6, "Coca-Cola", LocalDate.now(), 3, 32.99));
        this.tabela.add(new Produto(7, "Laranja", LocalDate.now(), 4, 32.99));
        this.tabela.add(new Produto(8, "Uva", LocalDate.now(), 4, 32.99));
        this.tabela.add(new Produto(9, "Grego", LocalDate.now(), 5, 32.99));
        this.tabela.add(new Produto(10, "", LocalDate.now(), 5, 32.99));
        this.tabela.add(new Produto(11, "", LocalDate.now(), 6, 32.99));
        this.tabela.add(new Produto(12, "", LocalDate.now(), 6, 32.99));

    }

    public ProdutoFakeDB() {
        super();
    }

}
