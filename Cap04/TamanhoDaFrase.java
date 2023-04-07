package Cap04;
import javax.swing.JOptionPane;
public class TamanhoDaFrase {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Fornça uma frase");
        int tamanho = frase.length();
        JOptionPane.showMessageDialog(null, "Frase: " + frase
                + "\nQuantidade de caracteres: " + tamanho);
        System.exit(0);
    }
}
