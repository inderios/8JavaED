package ExercicioCap03;
import javax.swing.JOptionPane;
public class Exercicio01 {
    public static void main(String[] args) {
        try {
            String nomeProduto = JOptionPane.showInputDialog("Nome do produto: ");
            double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto: "));
            double desconto = 0;
            if (precoProduto >= 50 && precoProduto < 200) {
                desconto = 0.05;
            } else if (precoProduto >= 200 && precoProduto < 500) {
                desconto = 0.06;
            } else if (precoProduto >= 500 && precoProduto < 1000)  {
                desconto = 0.07;
            }else if (precoProduto >= 1000) {
                desconto = 0.08;
            }
            double precoDesconto = precoProduto - (precoProduto * desconto);
            JOptionPane.showMessageDialog(null, "O produto: " + nomeProduto +
                    "\nPreço produto : " + String.format("%.2f\n",precoProduto) +
                    "Preço do produto após desconto: " + String.format("%.2f\n", precoDesconto));
        } catch (NumberFormatException erro) {
            System.out.println("Você não digitou um número" + erro.toString());
        }
        System.exit(0);
    }
}
