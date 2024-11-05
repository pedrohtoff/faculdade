package dominio;

public class Livro extends BaseParametro {
    public Livro() {
        super();
    }

    public Livro(int codigo, String titulo, String autor, String isbn, int anoPublicacao) {
        super(codigo, titulo, autor, isbn, anoPublicacao);
    }
}
