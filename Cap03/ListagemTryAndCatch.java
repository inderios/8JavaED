package Cap03;
import javax.swing.*;
public class ListagemTryAndCatch {
    public static void main(String[] args) {
        try {
            String aux1 = JOptionPane.showInputDialog("Forneça valor do 1° número:");
            int num1 = Integer.parseInt(aux1);
            String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2° número");
            int num2 = Integer.parseInt(aux2);
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));
        } catch (ArithmeticException erro) {//trata o erro da linha 13, divisão por zero
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero!\n" + erro.toString(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException |/* << se comporta como um operador aritmetico*/ NullPointerException erro) { // erro de conversão de formatos númericos e cancel, catch pode trata dois erros ao mesmo tempo agora.
            JOptionPane.showMessageDialog(null, "Erro de Conversão!\n" + erro.toString(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Final da execução!");
        }
        System.exit(0);
    }
}
