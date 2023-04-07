package ExercicioCap03;
import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        int resposta = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha\n 1-Exercicio 1\n 2-Exercicio 2\n 3-Exercicio 3\n 4-Exercicio 4\n"));
        switch (resposta) {
            case 1:
                String[] a = {};
                Exercicio01.main(a);
                break;
            case 2:
                String[] b = {};
                Exercicio02.main(b);
                break;
            case 3:
                String[] c = {};
                Exercicio03.main(c);
                break;
            case 4:
                String[] d = {};
                Exercicio04.main(d);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Não existe esse serviço");
        }
    }
}
