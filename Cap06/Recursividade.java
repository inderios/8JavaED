package Cap06;

public class Recursividade {
    public static void main(String[] args) {
        System.out.println(calcularFactorial(11));
    }
    public static long calcularFactorial(long num) {
        if (num <= 1) {
            return (1);
        } else {
            return (num * calcularFactorial(num - 1));
        }
    }
}
