package view;

import java.time.LocalDate;

import domain.ClasseProduto;

public class ClasseProdutoVisao {
    public void Exibir() {
        ClasseProduto cp1 = new ClasseProduto(1, "Carnes", LocalDate.now());
        System.out.println("Classe de Produto 1: ");
        System.out.println("Codigo: " + cp1.getCodigo());
        System.out.println("Descrição: " + cp1.getDescricao());
        System.out.println("Data de inclusão: " + cp1.getDataInclusao());

        ClasseProduto cp2 = new ClasseProduto(2, "Bebidas", LocalDate.now());
        System.out.println("Classe de Produto 2: ");
        System.out.println("Codigo: " + cp2.getCodigo());
        System.out.println("Descrição: " + cp2.getDescricao());
        System.out.println("Data de inclusão: " + cp2.getDataInclusao());
    }
}
