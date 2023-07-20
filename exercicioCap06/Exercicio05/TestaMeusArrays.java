package exercicioCap06.Exercicio05;

public class TestaMeusArrays {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] array1 = MeusArrays.arrayAleatoria(10);
        int[] array2 = MeusArrays.arrayAleatoria(25);
        System.out.println(MeusArrays.elementoArrays(array1, array2, 0));
        long endTime = System.nanoTime();
        long duracao = (endTime - startTime);
        System.out.println("Nanosegundos: " + duracao);
    }    
}
