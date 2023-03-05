public class Recursividade {
    public static void main(String[] args) {
        int n = 10;
        System.out.print(fatorial(n));
    }
    public static int fatorial(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * fatorial(n - 1);
        }
    }
}
