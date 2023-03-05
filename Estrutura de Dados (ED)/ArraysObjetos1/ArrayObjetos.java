import javax.swing.JOptionPane;

public class ArrayObjetos {
    public static void main(String[] args) {
        MetodosArray.inserir(new Pessoa("Gerson", 45));
        MetodosArray.inserir(new Pessoa("Sandra", 28));
        MetodosArray.inserir(new Pessoa("José", 43));
        MetodosArray.inserir(new Pessoa("Anna", 22));
        MetodosArray.exibir();

        System.out.println("REMOVENDO........");

        boolean verifica = MetodosArray.remover(1);
        if (verifica) {
            MetodosArray.exibir();
        } else {
            System.out.println("ID não encontrado!");
        }

        boolean verificaNome = MetodosArray.atualizarNome(3);
        if (verificaNome) {
            System.out.println("TROCANDO NOME........");
            MetodosArray.exibir();
        } else {
            System.out.println("ID não encontrado!");
        }

    }
}