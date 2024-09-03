
import view.ClasseProdutoVisao;
import view.ProdutoVisao;
import view.SubClasseProdutoVisao;

public class App {
    public static void main(String[] args) throws Exception {
        ClasseProdutoVisao visaoCP = new ClasseProdutoVisao();
        SubClasseProdutoVisao visaoSCP = new SubClasseProdutoVisao();
        ProdutoVisao visaoP = new ProdutoVisao();
        visaoCP.Exibir();
        visaoSCP.Exibir();
        visaoP.Exibir();
    }
}
