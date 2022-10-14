package ExercicioCapTres;
import javax.swing.JOptionPane;
public class Exercicio04 {
    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Dígite um número"));
            int maxElementos = 10;
            String[] produtosLista = new String[maxElementos];
            for (int multiplos = 1; multiplos <= maxElementos; multiplos++) {
                int produto = multiplos * numero;
                String formulaString = String.format("%d X %d = %d", numero, multiplos, produto);
                produtosLista[multiplos-1] = formulaString;
            }
            String mensagem = String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n",
                    produtosLista[0], produtosLista[1], produtosLista[2], produtosLista[3],
                    produtosLista[4], produtosLista[5], produtosLista[6], produtosLista[7], produtosLista[8], produtosLista[9]);
            JOptionPane.showMessageDialog(null, mensagem);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite um número\n" + erro.toString());
        }
        System.exit(0);
    }
}
