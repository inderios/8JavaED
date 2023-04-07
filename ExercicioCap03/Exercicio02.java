package ExercicioCap03;
import javax.swing.JOptionPane;
public class Exercicio02 {
    public static void main(String[] args) {
        try {
            Integer[] resistencias = new Integer[4];
            int equivalente = 0, menor = 0, maior = 0;
            for (int contador = 0; contador < 4; contador++) {
                resistencias[contador] = Integer.parseInt(JOptionPane.showInputDialog("Resistencia " + (contador+1)));
                equivalente += resistencias[contador];
                if (maior < resistencias[contador]|| menor == 0) {
                    maior = resistencias[contador];
                }
                if (menor > resistencias[contador] || menor == 0) {
                    menor = resistencias[contador];
                }
            }
            String mensagem = String.format("Resistencia fornecidas:\n %s, %s, %s, %s\n" +
                            "A maior Resistencia: %d\n" +
                            "A menor Resistencia: %d\n" +
                            "A resistencia Equivalente: %d\n",
                    resistencias[0],resistencias[1],resistencias[2], resistencias[3], maior, menor, equivalente);
            JOptionPane.showMessageDialog(null, mensagem);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,"Você não digitou um número " + erro.toString());
        }
        System.exit(0);
    }
}
