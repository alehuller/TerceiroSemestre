import javax.swing.JOptionPane;

public class MetodosArray {
    private static Pessoa[] lista = new Pessoa[4];
    private static int indiceAtual = 0;

     /**
      * Insere um objeto no array de objetos
      * @param p
      */
    // Método - Função
    public static void inserir(Pessoa p) {
        if (indiceAtual == lista.length) {
            lista = alocarNovoArray();
        }
        p.setId(indiceAtual + 1);
        lista[indiceAtual++] = p;
    }

    public static void exibir() {
        /*
         * for(Pessoa p : lista) {
         * System.out.println(p.getNome());  /______ para o laço for aprimorado
         * System.out.println(p.getIdade()); \
         * System.out.println(p); <- @Overrride com for aprimorado
         * }
         */
        for (int i = 0; i < indiceAtual; i++) {
            System.out.println(lista[i]);
        }
    }
    
    /**
     * Aloca um novo array de tamanho 4 índices maior que o anterior
     * @return Pessoa[] 
     */
    public static Pessoa[] alocarNovoArray() {
        Pessoa[] novo = new Pessoa[indiceAtual+4];
        //Copiando os objetos para o novo array
        /* 
        for (int i = 0; i < lista.length; i++) {
            novo[i] = lista[i];
        }
        */
        System.arraycopy(lista, 0 , novo, 0, lista.length);
        return novo;
    }
    
    public static int pesquisar(int id) {
        int inicio = 0, fim = indiceAtual - 1; int meio;
        while(inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (id == lista[meio].getId()) {
                return meio;
            } else if (id < lista[meio].getId()) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1; //ID não encontrado...
    }

    public static boolean remover(int id) {
        int indicePesq = pesquisar(id);
        if (indicePesq != -1) {
            for (int i = indicePesq; i < indiceAtual - 1; i++) {
                lista[i] = lista[i + 1];
            }
            indiceAtual--;
            return true;
        }
        return false;
    }

    public static boolean atualizarNome(int id) {
        int indicePesq = pesquisar(id);
        if (indicePesq != -1) {
            String nome = JOptionPane.showInputDialog("Digite o nome atualizado: ");
            lista[indicePesq].setNome(nome);
            return true;       
        }
        return false;
    }

}

