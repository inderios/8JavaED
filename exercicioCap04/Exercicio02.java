package exercicioCap04;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Exercicio02 {
    public static void main(String[] args) {
        DecimalFormat  dj = new DecimalFormat("###0.00");
        double precoOriginal = 1;
        while (precoOriginal != 0) {
            double porcetagem = 0.12;
            precoOriginal = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Forneça o preço do produto: "));
            double novoPreco = precoOriginal + (precoOriginal * porcetagem);
            double precoArredondado = Math.round(novoPreco);
            JOptionPane.showMessageDialog(null, "O Valor com acrecimo é R$:" + dj.format(novoPreco)
                    + "\nValor Arredondando R$" + dj.format(precoArredondado));
        }
    }
}
/*Uma farmácia precisa ajustar os preços de seus produtos em 12%. Elabore uma classe que 
* recebeba o valor do produto e aplique o percentual de acréscimo. O novo valor a ser calculado deve ser arredondado 
* para mais ou para menos usando o método round.
* A classe deve também conter um laço de repetição que encerre o programa quando o usuário fornecer o valor zero (0)
*  para o valor do produto. Dessa forma, o usuário digita o valor do produto, 
* a classe calcula e mostra o valor com acréscimo, a seguir solicitar um novo valor. Esse processo continua enquanto 
* o valor do produto for diferente de zero; caso o contrário o programa será encerrado.*/
