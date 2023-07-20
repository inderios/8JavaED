package cap06;
public class MetodosComRetorno {
    public static void main(String[] args) {
        print(somar(2, 3));
        print(mostrarPares(100));
        print(mostrarDiasPorExtenso(3));
        print(contarLetrasA("Banana"));
    }
    public static double somar(double a, double b) {
        return a + b;
    }
    public static String mostrarPares(int valor) {
        String retorno = "";
        for (int a = 0; a <= valor; a = a +2) {
            retorno += + a+ " ";
        }
        return retorno;
    }
    public static String mostrarDiasPorExtenso(int dia) {
        String extenso = "Domingo";
        if (dia == 2) {
            extenso = "Segunda";
        } else if (dia == 3) {
            extenso = "Terça";
        } else if (dia == 4) {
            extenso = "Quarta";
        } else if (dia == 5) {
            extenso = "Quinta";
        } else if (dia == 6) {
            extenso = "Quinta";
        } else if (dia == 7) {
            extenso = "Sábado";
        } else {
            extenso = "Não reconhecido";
        }
        return extenso;
    }
    public static int contarLetrasA(String palavra) {
        int quantidade = 0;
        palavra = palavra.toUpperCase();
        for (int a = 0; a < palavra.length(); a++) {
            if (palavra.charAt(a) == 'A') {
                quantidade++;
            }
        }
        return quantidade;
    }
    public static void print(Object texto) {
        System.out.println(texto);
    }
}