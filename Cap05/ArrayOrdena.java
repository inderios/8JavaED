package Cap05;
import java.util.*;
public class ArrayOrdena {
    public static void main(String[] args) {
        String[] nomes = {"Lucas", "Daniel", "Julia", "Tatiana", "Izabela", "Matheus"};
        char[] vogais = {'i','u','a','o','e'};
        int[] numeros = {6,8,9,7,0,5,2,3,1,4};
        float[] notas = {7.6f,8.5f,9.7f,5.4f,7.4f};
        Arrays.sort(nomes);
        System.out.print("\nNomes: ");
        for (String nome: nomes) {
            System.out.print(nome+",  ");
        }
        Arrays.sort(vogais);
        System.out.print("\nVogais:  ");
        for (char vogal: vogais) {
            System.out.print(vogal+",  ");
        }
        Arrays.sort(numeros);
        System.out.print("\nNúmeros:  ");
        for(int numero: numeros) {
            System.out.print(numero+ ",  ");
        }
        Arrays.sort(notas);
        System.out.print("\nNotas:  ");
        for(float nota: notas){
            System.out.print(nota+ ",  ");
        }
        System.exit(0);

    }
}
