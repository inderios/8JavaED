package Cap04;
import java.text.DecimalFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
public class ConfiguracoesRegionais {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Locale local = Locale.getDefault();
        double valor = 1370.25;
        if (local.getCountry().equals("BR")) {
            df.applyPattern("R$  #,##0.00");
        }
        JOptionPane.showMessageDialog(null, "Configurações do Sistema Operacional:"
                + "\nSigal: " + local.getCountry()
                + "\nPais: " + local.getDisplayCountry()
                + "\nIdioma: " + local.getDisplayLanguage()
                + "\nTeclado: " + local.getDisplayName()
                + "\nvalora: " + df.format(valor));
        System.exit(0);
    }
}
