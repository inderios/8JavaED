package Cap04;
import javax.swing.JOptionPane;
public class ArredondamentoParaCima {
    public static void main(String args[]) {
        final float LOTACAO_ONIBUS = 50;
        int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Número de passageiros: "));
        float qtdeOnibus = numeroPassageiros/LOTACAO_ONIBUS;
        JOptionPane.showMessageDialog(null, "Quantidade de passageiros: " + numeroPassageiros
                + "\nQuantidade Calculada: " + qtdeOnibus
                + "\nQuantidade de Onibus necessários " + (int) Math.ceil(qtdeOnibus));
        System.exit(0);
    }
}
