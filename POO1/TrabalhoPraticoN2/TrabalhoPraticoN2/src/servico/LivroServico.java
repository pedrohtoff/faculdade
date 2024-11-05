package servico;

import java.util.ArrayList;

import dominio.Livro;
import repositorio.LivroRepositorio;

public class LivroServico extends BaseServico<Livro> {
    private LivroRepositorio repo;

    public LivroServico() {
        this.repo = new LivroRepositorio();
    }

    @Override
    public ArrayList<Livro> Navegar() {
        return this.repo.Browse();
    }

    @Override
    public Livro Ler(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public Livro Editar(Livro instancia) {
        return this.repo.Edit(instancia);
    }

    @Override
    public Livro Adicionar(Livro instancia) {
        return this.repo.Add(instancia);
    }

    @Override
    public Livro Deletar(int chave) {
        return this.repo.Delete(chave);
    }

}
