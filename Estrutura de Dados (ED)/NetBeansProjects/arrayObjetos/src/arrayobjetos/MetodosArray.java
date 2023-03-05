package arrayobjetos;

public class MetodosArray {

    private static Pessoa[] lista = new Pessoa[4];
    private static int indiceAtual = 0;

    /**
     * Insere um objeto no array de objetos.
     * @param p 
     */
    //metodo - funcao
    public static void inserir(Pessoa p) {
        if (indiceAtual == lista.length) {
            lista = alocarNovoArray();
        }
        lista[indiceAtual++] = p;
    }

    public static void exibir() {
        /*for(Pessoa p: lista) {
            //System.out.println(p.getNome() + " " + p.getIdade());
            System.out.println(p);
        }*/
        for (int i = 0; i < indiceAtual; i++) {
            System.out.println(lista[i]);
        }
    }

    /**
     * Aloca um novo array de tamanho 4 indices maior do que o anterior 
     * @return Pessoa[]
     */
    private static Pessoa[] alocarNovoArray() {
        Pessoa[] novo = new Pessoa[indiceAtual + 4];
        //copiando os objetos para o novo array
        /*for (int i = 0; i < lista.length; i++) {
            novo[i] = lista[i];
        }*/
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }
}
