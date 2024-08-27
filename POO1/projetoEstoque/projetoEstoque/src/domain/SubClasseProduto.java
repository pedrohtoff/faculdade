package domain;

import java.time.LocalDate;

public class SubClasseProduto extends BaseParametro {
    private int codigoClasse;

    public int getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(int codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    public SubClasseProduto() {
        super();
    }

    public SubClasseProduto(int codigo, String descricao, LocalDate dataInclusao, int codigoClasse) {
        super(codigo, descricao, dataInclusao);
        this.codigoClasse = codigoClasse;
    }

}
