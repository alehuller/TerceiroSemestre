public class ArvoreBinaria {
    private Elemento raiz, atual;

    public void inserir(int num) {
        if (raiz == null) {
            raiz = new Elemento(num);
        } else {
            atual = new Elemento(num);
            inserir(raiz, atual);
        }
    }

    private void inserir(Elemento e, Elemento atual) {
        if (atual.getNum() >= e.getNum()) { // Árvore vazia
            if (e.getDir() == null) {
                e.setDir(atual);
            } else {
                inserir(e.getDir(), atual);
            }
        } else {
            if (e.getEsq() == null) {
                e.setEsq(atual);
            } else {
                inserir(e.getEsq(), atual);
            }
        }
    }

    public void ordem(Elemento e) {
        if (e != null) {
            ordem(e.getEsq()); //percorra sub esq
            System.out.print(e.getNum() + " "); //visite raiz
            ordem(e.getDir()); //percorra sub dir
        }
    }

    public Elemento getRaiz() {
        return raiz;
    }

    public void pre(Elemento e) {
        if (e != null) {
            System.out.print(e.getNum() + " ");
            pre(e.getEsq());
            pre(e.getDir());
        }
    }
}
