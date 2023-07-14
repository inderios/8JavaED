package cap08;
import javax.swing.*;
public class CarregaFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Uso de botões");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GuiCombo());//apenas mude apos o new para testar o frame.
        frame.setBounds(0,  0, 500, 300);
        frame.setVisible(true);
    }
}
