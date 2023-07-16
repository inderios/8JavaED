package cap08;
import javax.swing.*;

import cap08.layouts.LayoutTestes;
public class CarregaFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Uso de botões");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GuiMenuPrincipal());//apenas mude apos o new para testar o frame.
        frame.setBounds(0,  0, 315, 235);
        frame.setVisible(true);
    }
}
