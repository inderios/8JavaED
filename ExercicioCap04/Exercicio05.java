package ExercicioCap04;
import javax.swing.JOptionPane;
public class Exercicio05 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        String[] palavrasOfensivas = {"sexo", "sexual"};
        boolean improprio = false;
        for (int k = 0; k < palavrasOfensivas.length; k++) {
            if (frase.toLowerCase().indexOf(palavrasOfensivas[k].toLowerCase()) != -1) {
                improprio = true;
            }
        }
        String mensagem = "";
        if(improprio) {
            mensagem = "Conteúdo improprio";
        }else {
            mensagem = "Conteúdo liberado";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
