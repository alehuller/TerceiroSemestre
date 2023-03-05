package lista;

public class MetodosLista {
    private static Elemento inicio = null, atual, aux;
    
    /**
     * Insere objetos na lista simplesmente encadeada.
     * @param objeto Object
     */
    
    public static void inserir(Object objeto) {
        if (inicio == null) {
            //lista vazia
            inicio = new Elemento(objeto, null);
            aux = inicio;
        }
        else {
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }
    
    /**
     * Exibe o conteudo da lista simplesmente ligada.
     */
    public static void exibir() {
        Elemento e = inicio;
        while(e != null) {
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }
    /**
     * Pesquisa em uma lista simplesmente ligada.
     * @param nome String
     * @return Object
     */
    public static Object pesquisar(String nome){
        Elemento e = inicio;
        Pet pet;
        while(e != null) {
            pet =(Pet)e.getObjeto();
            if(nome.equals(pet.getNome())) {
                return pet;
            }
            e = e.getProx();
        }
        return null;
    }
    
    /**
     * Pesquisa para a operacao de remover em um
     * elemento na lista simplesmente encadeada.
     * @param pet
     * @return 
     */
    
    private static Object[] pesquisar(Pet pet) {
        Elemento r = inicio;
        Elemento ar = inicio;
        Pet petPesq;
        Object[] v = new Object[2];
        while(r != null) {
            petPesq = (Pet)r.getObjeto();
            if(pet.getNome().equals(petPesq.getNome())) {
                v[0] = r;
                v[1] = ar;
                return v;
            }
            ar = r;
            r = r.getProx();
        }
        return null;
    }
    
    /**
     * 
     * @param pet
     * @return 
     */
    public static boolean remover(Pet pet) {
        Object[] v = pesquisar(pet);
        if(v != null) {
            Elemento r = (Elemento)v[0];
            Elemento ar = (Elemento)v[1];
            if (r == inicio) {
                inicio = r.getProx();
                r.setProx(null);
            }
            else if (r == atual) {
                atual = ar;
                aux = ar;
                ar.setProx(null);
            }
            else {
                ar.setProx(r.getProx());
                r.setProx(null);
            }
            return true;
        }
        return false;
    }

}
