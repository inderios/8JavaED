package Cap03;

import javax.swing.*;
import java.io.IOException;

public class InstrucaoThrows {
    public static void main(String arg[]) throws IOException {
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade"));
            if (idade < 18) {
                throw new Exception ("Menor de Idade, entrada não permitida!!");
            }else {
                JOptionPane.showMessageDialog(null, "Idade válida, seja bem-vindo!");
            }
        }catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.toString());
        }
        System.exit(0);
    }
}
