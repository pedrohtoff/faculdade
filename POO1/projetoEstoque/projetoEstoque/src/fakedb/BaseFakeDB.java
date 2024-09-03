package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDomain> {
    protected ArrayList<TDomain> tabela;

    // Propriedade Somente Leitura (Read-only)
    public ArrayList<TDomain> getTabela() {
        return tabela;
    }

    // 1- metodos abstract n podem ter codigo
    // 2- metodos abstract devem ser codificados nas filhas (reais)
    // 3- este metodo deve ser executado toda vez que a classe filha for instanciada
    protected abstract void preencherDados();

    public BaseFakeDB() {
        this.preencherDados();
    }
}
