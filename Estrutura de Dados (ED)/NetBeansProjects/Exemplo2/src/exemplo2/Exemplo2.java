/* Elaborar um algoritmo que receba numeros reais aleatorios de simples precisao e armazene-os em um array
bidimensional quadrado de ordem 5. Finalmente, apresente os valores da diagonal primaria.
*/

package exemplo2;

import java.util.Random;
import java.util.Arrays;

public class Exemplo2 {

    public static void main(String[] args) {
        float[][] m = new float[5][5];
        Random rd = new Random();
        
        //entrada de numeros aleatorios
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = rd.nextFloat()*100;
            }
        }
        //exibe a diagonal principal
        /*for (int i = 0; i < m.length; i++) {
            System.out.printf("m[" + i + "][" + i + "] = %.2f\n", m[i][i]);
        }*/
        
        //Exibir todos os valores da matriz
        /*System.out.println(Arrays.deepToString(m).replace("],", "],\n"));*/ 
        
        for(float[] linha:m) {
            for(float coluna:linha) {
                System.out.println(coluna);
            }
        }
    }
}

