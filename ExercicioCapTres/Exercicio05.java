package ExercicioCapTres;
import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        int resposta = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha\n 1-Exercicio 1\n 2-Exercicio 2\n 3-Exercicio 3\n 4-Exercicio 4\n"));
        switch (resposta) {
            case 1:
                Exercicio01;
                break;
            case 2:
                Exercicio02
                break;
            case 3:
                Exercicio03
                break;
            case 4:
                Exercicio04
                break;
            default:
                JOptionPane.showMessageDialog(null,"Não existe esse serviço");
        }
    }
}
