package exercicioCap08;

import javax.swing.*;
import java.awt.*;

public class GuiExercicio01 extends JPanel {
    private JButton[] espaçoDoXadrex = new JButton[64];
    public GuiExercicio01() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setLayout(new GridLayout(8, 8));

        Color branco = Color.WHITE;
        Color preto = Color.BLACK;

    }
}
