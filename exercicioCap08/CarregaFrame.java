package exercicioCap08;
import javax.swing.*;

public class CarregaFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Uso de botões");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GuiExercicio05());//apenas mude apos o new para testar o frame.
        frame.setBounds(0,  0, 500, 430);
        frame.setVisible(true);
    }
}