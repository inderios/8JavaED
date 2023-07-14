package cap08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiCombo extends JPanel {
    private JComboBox cbEstados;
    private JLabel lbEstados;
    private JButton btMostrar;

    public GuiCombo(){
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        String[] cbEstadosItens = {"Espírito Santos", "Minas Gerais", "Rio de Janeiro", "São Paulo"};
        cbEstados = new JComboBox(cbEstadosItens);
        lbEstados = new JLabel("Estados do Sudeste: ");
        btMostrar = new JButton("Mostrar");
        add(lbEstados);
        add(cbEstados);
        add(btMostrar);
        lbEstados.setBounds(25, 15, 150, 25);
        cbEstados.setBounds(25, 40, 150, 25);
        btMostrar.setBounds(25, 75, 100, 25);
    }
    private void definirEventos() {
        btMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Indice selecionado: " + cbEstados.getSelectedIndex()
                                + "\nTexto Selecionado: " + cbEstados.getSelectedItem());
            }
        });
    }
}
