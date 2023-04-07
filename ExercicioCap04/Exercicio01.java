package ExercicioCap04;
import javax.swing.JOptionPane;
public class Exercicio01 {
    public static void main(String[] args) {
        int somaDados = 0;
        String dados = "";
        for(int i = 1; i <= 3; i++) {
            int dado = (int) Math.floor(Math.random() * 6 + 1);
            somaDados += dado;
            dados += dado;
        }
        JOptionPane.showMessageDialog(null,"Números Sorteados:"
                + "\n" + dados.charAt(0)
                + "\n" + dados.charAt(1)
                + "\n" + dados.charAt(2)
                + "\nTotal = " + somaDados);
        System.exit(0);
    }
}
