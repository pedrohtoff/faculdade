package domain;

import java.time.LocalDate;

public class Produto extends BaseParametro {
    private int codigoSubClasse;
    private double valor;

    public int getCodigoSubClasse() {
        return codigoSubClasse;
    }

    public void setCodigoSubClasse(int codigoSubClasse) {
        this.codigoSubClasse = codigoSubClasse;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto() {
        super();
    }

    public Produto(int codigo, String descricao, LocalDate dataInclusao, int codigoSubClasse, double valor) {
        super(codigo, descricao, dataInclusao);
        this.codigoSubClasse = codigoSubClasse;
        this.valor = valor;
    }

}
