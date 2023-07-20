package exercicioCap06.Exercicio05;
public class MeusArrays {
    public static int elementoArrays(int[] array1, int[] array2, int procurarElemento) {
        int retorno = 0;
        if (navegadorArrays(array1, procurarElemento)) {
            retorno++;
        }
        if (navegadorArrays(array2, procurarElemento)) {
            retorno++;
        }
        return retorno;
    }
    public static int[] arrayAleatoria(int n) {
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 1001);
        }
        return array;
    }
    private static boolean navegadorArrays(int[] array, int elemento) {
        boolean achou = false;
        for(int i: array) {
            if(elemento == i) {
                achou = true;
                break;
            }
        }
        return achou;
    }
}
/**
 * Elabore uma classe chamada "MeusArrays"  contendo dois métodos que realizam operações com
 * arrays, conforme a descrição a seguir. Faça outra classe para testar os métodos:
 * A. um método que recebe dois arrays de inteiros e um número inteiro. Pesquise se esse número 
 * inteiro existe nos dois arrays e de um retorno conforme a descrição sequinte: se o número não for 
 * encontrado em nenhum dos arrays, retorne 0; caso encontre em um dos arrays, retorne 1;
 * e caso seja localizado nos dois arrays, retorne 2.
 * B. um método que receber um valor inteiro (n) e retorna um array contendo n elementos inteiros 
 * gerados randomicamente. Os valores gerados devem estrar entre 0 e 1000.
 */