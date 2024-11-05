package servico;

import java.util.ArrayList;

public abstract class BaseServico<TDominio> {
    public abstract ArrayList<TDominio> Navegar();

    public abstract TDominio Ler(int codigo);

    public abstract TDominio Editar(TDominio instancia);

    public abstract TDominio Adicionar(TDominio instancia);

    public abstract TDominio Deletar(int chave);
}
