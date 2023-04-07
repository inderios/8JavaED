package ExercicioCap05;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio04 {
    private static final int TAMANHO_ARRAY = 10;
    private static final int VALOR_MINIMO = 1;
    private static final int VALOR_MAXIMO = 20;
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < TAMANHO_ARRAY; i++) {
            int valorRandomico = random.nextInt(VALOR_MAXIMO - VALOR_MINIMO -1) + VALOR_MINIMO;
            numeros.add(valorRandomico);
        }
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        for (int numero: numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
        System.out.println("Numeros pares: " + pares.toString());
        System.out.println("Numeros impares: " + impares.toString());
    }
}
/*

Faça uma classe contendo dois array do tipo inteiro, um chamado par e outro chamado ímpar. Cada array deve conter 10
elementos. A seguir, faça um laçoi de repetição com 10 iterações e que contenha internamente a geração randômica de números 1 e 20.
Se o valor gerado for par, armazene no array chamado par, caso contrário, array chamado impar.
Ao final,apresente o conteúdo de cada um dos arrays
*/