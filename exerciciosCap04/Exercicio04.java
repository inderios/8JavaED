package exerciciosCap04;
import javax.swing.JOptionPane;
public class Exercicio04 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null,"Forneça uma frase: ");
        String fraseInversa = "";
        frase = frase.replace(" ", "");
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            fraseInversa += c;
        }
        JOptionPane.showMessageDialog(null, "Frase fornecida: " + frase
                + "\nFrase de trás para frente: " + fraseInversa);
        System.exit(0);
    }
}
