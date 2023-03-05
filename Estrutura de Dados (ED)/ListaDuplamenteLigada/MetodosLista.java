public class MetodosLista {
    private static Elemento aux, inicio = null, atual;

    /**
     * Método para inserir um objeto na lista
     * @param objeto
     */
    public static void inserir(Object objeto) {
        if(inicio == null) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null, aux);
            aux.setProx(atual);
            aux = atual;
        }
    }

    /**
     * Exibe os objetos da lista
     */
    public static void exibir() {
        Elemento e = inicio;
        while (e != null) {
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }

    public static Object[] pesquisar(String nome) {
        Elemento e = inicio;
        String nomePesq;
        while(e != null) {
            nomePesq = (String)e.getObjeto();
            if(nome.equalsIgnoreCase(nomePesq)) {
                Object[] v = new Object[2];
                v[0] = e;
                v[1] = nomePesq;
                return v;
            }
            e = e.getProx();
        }
        return null;
    }

    public static boolean remover(String nome) {
        Object[] obj = pesquisar(nome);
        if(obj != null) {
            Elemento e = (Elemento)obj[0];
            if(e == inicio) {
                inicio = e.getProx();
                e.setProx(null);
                inicio.setAnt(null);
            } else if (e == atual) {
                atual = e.getAnt();
                aux = atual;
                atual.setProx(null);
                e.setAnt(null);
            } else {
                e.getAnt().setProx(e.getProx());
                e.getProx().setAnt(e.getAnt());
                e.setAnt(null);
                e.setProx(null);
            }
            return true;
        }
        return false;
    }
}
