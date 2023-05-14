package cap04;
import javax.swing.JOptionPane;
public class CaracteresDaPalavra {
    public static void main(String[] args ){
        String palavra = JOptionPane.showInputDialog("Forneça uma " +
                "palavra com pelo menos 4 letra" );
        JOptionPane.showMessageDialog(null, "Palavra: " + palavra
                + "\nCaracter 1: " + palavra.charAt(0)
                + "\nCaracter 2: " + palavra.charAt(1)
                + "\nCaracter 3: " + palavra.charAt(2)
                + "\nCaracter 4: " + palavra.charAt(3));
        System.exit(0);
    }
}
