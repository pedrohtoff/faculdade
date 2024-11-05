package view;

import java.util.ArrayList;

import dominio.Livro;
import servico.LivroServico;

public class LivroMenu extends BaseMenu {
    private LivroServico srv;

    public LivroMenu() {
        super();
        this.srv = new LivroServico();
    }

    @Override
    public void ExibirMenu() {
        int op = 0;
        while (op != 9) {
            Util.LimparConsole();
            System.out.println("Cadastro de Livros");
            System.out.println("1 - Listar");
            System.out.println("2 - Localizar");
            System.out.println("3 - Adicionar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");
            System.out.println("9 - Sair");
            System.out.print("Selecione uma opção: ");
            op = this.scanner.nextInt();
            switch (op) {
                case 1:
                    this.Listar();
                    break;
                case 2:
                    this.Localizar();
                    break;
                case 3:
                    this.Adicionar();
                    break;
                case 4:
                    this.Atualizar();
                    break;
                case 5:
                    this.Remover();
                    break;
                case 9:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }

    @Override
    public void Listar() {
        Util.LimparConsole();
        System.out.println("Listando...");
        ArrayList<Livro> lista = this.srv.Navegar();
        for (Livro l : lista) {
            this.ImprimirPorLinha(l);
        }
        System.out.println("Clique <ENTER> para continuar....");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Localizar() {
        Util.LimparConsole();
        System.out.println("Localizando....");
        System.out.println("Informe o código do livro a ser localizado: ");
        int cod = this.scanner.nextInt();
        Livro l = this.srv.Ler(cod);
        if (l != null) {
            this.ImprimirPorLinha(l);
        } else {
            System.out.println("Problema- Livro não encontrado!!!");
        }

        System.out.println("Clique <ENTER> para continuar....");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Adicionar() {
        Util.LimparConsole();
        System.out.println("Adicionando....");
        System.out.println(" Informe o título: ");
        String titulo = this.scanner.next();
        System.out.println(" Informe o autor: ");
        String autor = this.scanner.next();
        System.out.println(" Informe o ISBN: ");
        String isbn = this.scanner.next();
        System.out.println(" Informe o Ano de publicação: ");
        int ano = this.scanner.nextInt();
        Livro l = new Livro();
        l.setTitulo(titulo);
        l.setAutor(autor);
        l.setIsbn(isbn);
        l.setAnoPublicacao(ano);
        if (this.srv.Adicionar(l) != null) {
            System.out.println("Livro adicionado com sucesso!!!");
        } else {
            System.out.println("Problema - Erro ao adicionar o Livro");
        }

        System.out.println("Clique <ENTER> para continuar....");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Atualizar() {
        Util.LimparConsole();
        System.out.println("Atualizando....");
        System.out.println("Informe o código do livro: ");
        int cod = this.scanner.nextInt();
        Livro l = this.srv.Ler(cod);
        if (l != null) {
            System.out.println(" Livro encontrado! ");
            System.out.println(" Informe o novo título: ");
            String titulo = this.scanner.next();
            System.out.println(" Informe o novo autor: ");
            String autor = this.scanner.next();
            System.out.println(" Informe o novo ISBN: ");
            String isbn = this.scanner.next();
            System.out.println(" Informe o novo Ano de publicação: ");
            int ano = this.scanner.nextInt();
            l.setTitulo(titulo);
            l.setAutor(autor);
            l.setIsbn(isbn);
            l.setAnoPublicacao(ano);
            if (this.srv.Editar(l) != null) {
                System.out.println("Alteração feita com sucesso!!");
            } else {
                System.out.println("Problema- Alteração não foi realizada");
            }
        } else {
            System.out.println("Problema - Livro não encontrado");
        }

        System.out.println("Clique <ENTER> para continuar....");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Remover() {
        Util.LimparConsole();
        System.out.println("Removendo....");
        System.out.println("Informe o código do livro: ");
        int cod = this.scanner.nextInt();
        Livro l = this.srv.Ler(cod);
        if (l != null) {
            if (this.srv.Deletar(cod) != null) {
                System.out.println("Livro excluído com sucesso!");
            } else {
                System.out.println("Problema- Livro não encontrado");
            }
        } else {
            System.out.println("Problema - Livro não encontrado!");
        }

        System.out.println("Clique <ENTER> para continuar....");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    private void ImprimirPorLinha(Livro l) {
        String mensagem = "";
        mensagem += "Livro: ";
        mensagem += "Código: " + l.getCodigo() + " | ";
        mensagem += "Título: " + l.getTitulo() + " | ";
        mensagem += "Autor: " + l.getAutor() + " | ";
        mensagem += "ISBN: " + l.getIsbn() + " | ";
        mensagem += "Ano de Publicação: " + l.getAnoPublicacao() + " | ";
        System.out.println(mensagem);
    }
}
