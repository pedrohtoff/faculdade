package view;

import java.util.ArrayList;
import domain.ClasseProduto;
import fakedb.ClasseProdutoFakeDB;

public class ClasseProdutoVisao {
    public void Exibir() {
        ClasseProdutoFakeDB db = new ClasseProdutoFakeDB();
        ArrayList<ClasseProduto> lista = db.getTabela();
        System.out.println("==========================================");
        for (ClasseProduto cp : lista) {
            System.out.println("Classe de produto: ");
            System.out.println("Código: " + cp.getCodigo());
            System.out.println("Descrição: " + cp.getDescricao());
            System.out.println("Data de Inclusao: " + cp.getDataInclusao());
            System.out.println("------------------------------------");
        }
    }
}
