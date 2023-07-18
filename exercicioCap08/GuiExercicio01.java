package exercicioCap08;

import javax.swing.*;
import java.awt.*;

public class GuiExercicio01 extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Tabuleiros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GuiExercicio01());//apenas mude apos o new para testar o frame.
        frame.setBounds(0,  0, 500, 500);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    public GuiExercicio01() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setLayout(new GridLayout(8, 8));
        Color cinza = Color.GRAY;
        Color preto = Color.BLACK;
        for (int linha = 1; linha <= 8; linha++) {
            for(int coluna = 1; coluna <= 8; coluna++) {
                JButton quadrado = new JButton();
                if( (linha + coluna) % 2  == 0) {
                    quadrado.setBackground(cinza);
                } else {
                    quadrado.setBackground(preto);
                }
                add(quadrado);
            }
        }
    }
}
