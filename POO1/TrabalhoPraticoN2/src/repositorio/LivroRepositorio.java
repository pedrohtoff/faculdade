package repositorio;

import dominio.Livro;
import fakedb.LivroFakeDB;

public class LivroRepositorio extends BaseRepositorio<Livro> {
    private LivroFakeDB db;

    public LivroRepositorio() {
        this.db = new LivroFakeDB();
        this.dados = this.db.getTabela();
    }

    @Override
    public Livro Read(int codigo) {
        for (Livro l : dados) {
            if (codigo == l.getCodigo()) {
                return l;
            }
        }
        return null;
    }

    @Override
    public Livro Edit(Livro instancia) {
        Livro l = this.Read(instancia.getCodigo());
        if (l != null) {
            l.setTitulo(instancia.getTitulo());
            l.setAutor(instancia.getAutor());
            l.setIsbn(instancia.getIsbn());
            l.setAnoPublicacao(instancia.getAnoPublicacao());
            return l;
        } else {
            return null;
        }
    }

    @Override
    public Livro Add(Livro instancia) {
        int pos = this.dados.size() - 1;
        Livro l = this.dados.get(pos);
        int novoCodigo = l.getCodigo() + 1;

        instancia.setCodigo(novoCodigo);
        this.dados.add(instancia);
        return instancia;
    }

    @Override
    public Livro Delete(int codigo) {
        Livro l = this.Read(codigo);
        if (l != null) {
            this.dados.remove(l);
            return l;
        } else {
            return null;
        }
    }

}
