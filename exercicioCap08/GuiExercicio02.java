package exercicioCap08;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class GuiExercicio02 extends JPanel{
    private String[] paisesOpcoes;
    private JLabel paisLabel;
    private JComboBox<String> caixaDeOpcoes;

    public GuiExercicio02() {
        inicializarComponente();
        //definirEventos();
    }

    private void inicializarComponente() {
        setLayout(null);
        paisesOpcoes = new String[]{"Alemanha", "Brasil", "China", "Espanha", "Portugal"};
        caixaDeOpcoes = new JComboBox<String>(paisesOpcoes);
        caixaDeOpcoes.setBounds(25, 15, 150, 25);
        paisLabel = new JLabel();
        paisLabel.setBounds(150, 30, 600, 600);
        paisLabel.setIcon((Icon) Color.BLACK);
        paisLabel.isOpaque();
        add(caixaDeOpcoes);
        add(paisLabel);
    }


    private void definirEventos() {
        caixaDeOpcoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });{
        }
    }
}
