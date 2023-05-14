package cap06;
public class MetodosSemRetorno {
    public static void main(String[] args) {
      imprimir();
      imprimirTexto("Rola");
      mostrarQuadrado(10);
      somar(10, 20);
      mostrarMaior(10, 20, 30); 
      mostrarSexoPorExtenso('F'); 
    }
    public static void imprimir() {
        System.out.println("Aprendendo a linguagem Java");
    }
    public static void imprimirTexto(String texto) {
        System.out.println(texto);
    }
    public static void somar (int a, int b) {
        System.out.println(a + b);
    }
    public static void mostrarQuadrado (int valor) {
        System.out.println(Math.pow(valor, 2));
    }
    public static void mostrarMaior(int a, int b, int c) {
        System.out.println(Math.max(a, b));    
    }
    public static void mostrarSexoPorExtenso(char sexo) {
        if (sexo == 'F') {
            System.out.println("Feminino");
        } else if (sexo == 'M') {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo desconhecido");
        }
    }
}