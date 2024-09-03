package view;

import java.util.ArrayList;

import domain.SubClasseProduto;
import fakedb.SubClasseProdutoFakeDB;

public class SubClasseProdutoVisao {
    public void Exibir() {
        SubClasseProdutoFakeDB db = new SubClasseProdutoFakeDB();
        ArrayList<SubClasseProduto> lista = db.getTabela();
        System.out.println("==========================================");
        for (SubClasseProduto scp : lista) {
            System.out.println("Sub Classe de produto: ");
            System.out.println("Código: " + scp.getCodigo());
            System.out.println("Descrição: " + scp.getDescricao());
            System.out.println("Data de Inclusao: " + scp.getDataInclusao());
            System.out.println("Codigo Classe: " + scp.getCodigoClasse());
            System.out.println("------------------------------------");
        }
    }
}
