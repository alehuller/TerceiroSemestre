/**
 * UsaArvoreBinaria
 */
public class UsaArvoreBinaria {

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(15);
        arvore.inserir(28);
        arvore.inserir(35);
        arvore.inserir(19);

        arvore.pre(arvore.getRaiz());
    }
}