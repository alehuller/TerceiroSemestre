/*elaborar um algoritmo que defina um array para receber valores float.
Exiba todos os valores em um loop separado.
*/

package exemploarray;

import java.util.Random;
import java.text.DecimalFormat;
import java.util.Arrays;

public class ExemploArray {
    
    public static void main(String[] args) {
        float[] v = new float[10];
        Random rd = new Random();
        DecimalFormat df = new DecimalFormat("#.0");
        
        for(int i = 0; i < v.length; i++) {
            v[i] = 1 + rd.nextFloat()*50;
        }
        
        /*for(int i = 0; i < v.length; i++) {
            System.out.println("v[" + i + "] = " + df.format(v[i]));
        }*/
        
        /*
        for(float a:v) {
            System.out.println(a);
        }*/
        
        System.out.println(Arrays.toString(v));
    }
    
}
