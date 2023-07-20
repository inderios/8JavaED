package cap06;

import java.util.Arrays;

public class MetodosComArray {
    /**
     * Recebe um array de numeros e retorna o maior deles, deve conter pelo
     * menos um elemento no array senão gera erro.
     * 
     * @param numeros = os numeros a serem comparados 
     * @return = o maior número
     */
    public static double buscarMaior(double[] numeros) {
        double maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            maior = Math.max(maior, numeros[i]);
        }
        return maior;
    }
    /**
     * recebe um array de palavras e retorna ordenados em ordem crescente
     * 
     * @param palavras = as palavrs a serem ordenadas
     * @return = o array ordenado
     */
    public static String[] ordenarPalavras(String[] palavras) {
        Arrays.sort(palavras);
        return palavras;
    }
}