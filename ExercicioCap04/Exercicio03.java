package ExercicioCap04;
import javax.swing.JOptionPane;
public class Exercicio03 {
    public static void main(String[] args) {
        int min = 5, max = 10;
        int numAleatorio = (int) Math.round((Math.random()*(max - min)) + min);
        String senhaGerada = "";
        for (int i = 1; i <= numAleatorio; i++) {
            senhaGerada += String.valueOf((int) (Math.random() * 10));
        }
        JOptionPane.showMessageDialog(null, "Número sorteado: " + numAleatorio 
                +"\nSenha Gerada: " + senhaGerada );
    }
}
