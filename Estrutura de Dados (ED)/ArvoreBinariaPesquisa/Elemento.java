public class Elemento {
    private int num;
    private Elemento dir, esq;

    public Elemento(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Elemento getDir() {
        return dir;
    }

    public void setDir(Elemento dir) {
        this.dir = dir;
    }

    public Elemento getEsq() {
        return esq;
    }

    public void setEsq(Elemento esq) {
        this.esq = esq;
    }
}
