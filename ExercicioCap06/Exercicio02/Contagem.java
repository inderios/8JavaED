package ExercicioCap06.Exercicio02;

public class Contagem {
    public static void contar() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void contar(int fim) {
        for(int i = 1; i <= fim; i++) {
            System.out.println(i);
        }
    }
    public static void contar(int inicio, int fim) {
        while(inicio <= fim) {
            System.out.println(inicio);
            inicio++;
        }
    }
    public static void contar(int inicio, int fim, int pausa) throws InterruptedException {
        while(inicio <= fim) {
            System.out.println(inicio);
            inicio++;
            Thread.sleep(pausa * 1000);
        }
    }
}
/**
 * Crie uma classe chamada Contagem que contenha quatro métodos com o nome "contar" utilizando 
 * o conceito da sobrecarga. A assinatura e função de cada método aparecem descritas na tabela a seguir.
 * Faça também outra classe para testar o método. 
 */