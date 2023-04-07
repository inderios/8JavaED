package ExercicioCap05;
import javax.swing.*;
import java.util.Arrays;
public class Exercicio01 {
    public static void main(String[] args) {
        float[] notas = new float[5];
        for (int i = 0; i < notas.length; i++) {
            float nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Por favo forneça" +
                    " a nota do aluno: " + i));
            notas[i] = nota;
        }
        notas = burbleSortDescentente(notas);
        float media = calcularMedia(notas);
        JOptionPane.showMessageDialog(null, Arrays.toString(notas) + "\n" + "Média: " + media);

        }
    public static float[] burbleSortDescentente (float[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n -i -1; j++) {
                if (arr[j] < arr[j +1]) {
                    float temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = temp;
                }
            }
        }
        return arr;
    }
    public static float calcularMedia(float[] arr) {
        float soma = 0;
        for (float a: arr) {
            soma += a;
        }
        return soma/arr.length;
    }
}
/*
Elabore uma classe que receba 5 notas de alunos por meio do showInputDialog, armezene essas notas em uma array de cinco
elementos, apresente em tela as cinco notas em ordem decrescente (da maior para a menor) e a média aritmética das notas.
*/
