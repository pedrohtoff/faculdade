package view;

import java.util.ArrayList;

import domain.Produto;
import fakedb.ProdutoFakeDB;

public class ProdutoVisao {
    public void Exibir() {
        ProdutoFakeDB db = new ProdutoFakeDB();
        ArrayList<Produto> lista = db.getTabela();
        System.out.println("==========================================");
        for (Produto p : lista) {
            System.out.println("Produto: ");
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Descrição: " + p.getDescricao());
            System.out.println("Data de Inclusao: " + p.getDataInclusao());
            System.out.println("Codigo SubClasse: " + p.getCodigoSubClasse());
            System.out.println("Valor: " + p.getValor());
            System.out.println("------------------------------------");
        }
    }
}
