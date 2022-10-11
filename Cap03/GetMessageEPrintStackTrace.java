package Cap03;

import javax.swing.*;

public class GetMessageEPrintStackTrace {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número"));
        try {
            int y = x / 0; //gera um exceção
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            erro.printStackTrace();
        }
    }
}
