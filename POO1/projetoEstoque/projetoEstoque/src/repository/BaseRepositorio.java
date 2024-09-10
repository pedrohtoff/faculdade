package repository;

import java.util.ArrayList;

public abstract class BaseRepositorio<TDomain> {
    protected ArrayList<TDomain> dados;

    public ArrayList<TDomain> Browse() {
        return this.dados;
    }

    public abstract TDomain Read(int chave);

    public abstract TDomain Edit(TDomain instancia);

    public abstract TDomain Add(TDomain instancia);

    public abstract TDomain Delete(int chave);
}
