package exemplo;

/*elabore um algoritmo que armazene 30 números gerados aleatoriamentee exiba-os*/

import java.util.Random;

public class ExemploVet1 {

    public static void main(String[] args) {
        int[] v; //referencia ou  pode ser feito int[] v = new int[30];
        v = new int[30]; //alocacao do array
        Random rd = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = rd.nextInt(101);
            System.out.println("v[" + (i + 1) + "]=" + v[i]);
        }
    }
}
