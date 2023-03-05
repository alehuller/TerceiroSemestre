import java.util.Random;

public class ArrayLivros {
    public static Livro[] lista = new Livro[10];

    public static int indice = 0;
    static Random random = new Random();

    public static void inserir(Livro x) {
        if (indice == lista.length) {
            lista = aumentarArray();
        }
        x.setId(geraId());
        lista[indice++] = x;
        
    }

    private static int geraId() {
        int x;
        do {
            x = 1 + random.nextInt(10);
        } while (isIdNaLista(x));
        return x;
    } 

    private static boolean isIdNaLista(int id) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static Livro[] aumentarArray() {
        Livro[] novo = new Livro[indice + 5];
        for (int i = 0; i < lista.length; i++) {
            novo[i] = lista[i];
        }
        return novo;
    }

    public static void exibir() {
        for (int i = 0; i < indice; i++) {
            System.out.println(lista[i]);
        }
    }

    public static int pesquisarID(int id) {
        int inicio = 0, fim = indice - 1;
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (id == lista[meio].getId()) {
                return meio;
            } else if (id < lista[meio].getId()) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1; // ID inválido...
    }

    public static boolean remover(int id) {
        int pesq = pesquisarID(id);
        if (pesq != -1) {
            for (int i = pesq; i < indice - 1; i++) {
                lista[i] = lista[i + 1];
            }
            indice--;
            return true;
        }
        return false;
    }

    public static void pesquisarNome(String nome) {
        mergeSort(0, indice, lista);
        int inicio = 0, fim = indice - 1;
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (nome.compareToIgnoreCase(lista[meio].getTitulo()) == 0) {
                System.out.println("Pesquisa de livro.");
                System.out.println("Livro pesquisado: " + lista[meio].getTitulo());
                System.out.println("Autor do livro: " + lista[meio].getAutor());
                System.out.println("Preço do livro: " + lista[meio].getPreco());
                System.out.println("ID do livro: " + lista[meio].getId());
                break;
            } else if (nome.compareToIgnoreCase(lista[meio].getTitulo()) < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
    }

    public static void mergeSort(int inicio, int tamanho, Livro[] v) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeSort(inicio, meio, v);
            mergeSort(meio, tamanho, v);
            intercalar(inicio, meio, tamanho, v);
        }
    }

    private static void intercalar(int inicio, int meio, int tamanho, Livro[] v) {
        int i, j, k;
        i = inicio;
        j = meio;
        k = 0;
        Livro[] auxiliar = new Livro[tamanho - inicio];
        while (i < meio && j < tamanho) {
            if (v[i].getTitulo().compareToIgnoreCase(v[j].getTitulo()) <= 0) {
                auxiliar[k] = v[i];
                k++;
                i++;
            } else {
                auxiliar[k] = v[j];
                k++;
                j++;
            }
        }
        while (i < meio) {
            auxiliar[k] = v[i];
            k++;
            i++;
        }

        while (j < tamanho) {
            auxiliar[k] = v[j];
            k++;
            j++;
        }

        for (i = inicio; i < tamanho; i++) {
            v[i] = auxiliar[i - inicio];
        }
    }
}