package cap08;

import javax.swing.*;
import java.awt.event.*;

public class GuiLista extends JPanel{
    private JButton btCalcular;
    private JLabel lbValor;
    private JTextField tfValor, tfValorDesconto;
    private JList<String> liDesconto;
    private JScrollPane spLista;

    public GuiLista() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        String[] liDescontosItens = {"10%", "20%", "30%", "40%", "50%"};//criação de uma lista;
        btCalcular = new JButton("Calcular");
        lbValor = new JLabel("Valor");
        tfValor = new JTextField(5);
        liDesconto = new JList<>(liDescontosItens);
        tfValorDesconto = new JTextField(5);
        spLista = new JScrollPane(liDesconto);
        btCalcular.setToolTipText("Faz o Calculo!");
        btCalcular.setMnemonic(KeyEvent.VK_C);
        lbValor.setBounds(35, 05, 100, 25);
        tfValor.setBounds(35, 30, 100, 25);
        spLista.setBounds(35, 60, 100, 55);
        btCalcular.setBounds(35, 120, 90, 25);
        tfValorDesconto.setBounds(35, 150, 100, 25);
        add(btCalcular);
        add(lbValor);
        add(tfValor);
        add(spLista);
        add(tfValorDesconto);
    }
    private void definirEventos() {
        btCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (tfValor.getText().equals(" ")) {
                    tfValor.requestFocus();
                    return;
                }
                try {
                    float valor = Float.parseFloat(tfValor.getText());
                    float desconto = 0.9f;
                    if (liDesconto.getSelectedIndex() == 1) {
                        desconto = 0.8f;
                    } else if (liDesconto.getSelectedIndex() == 2) {
                        desconto = 0.7f;
                    } else if (liDesconto.getSelectedIndex() == 3) {
                        desconto = 0.6f;
                    } else if (liDesconto.getSelectedIndex() == 4) {
                        desconto = 0.5f;
                    } 

                    tfValorDesconto.setText(" " + valor * desconto);
                
                } catch (NumberFormatException erro) {
                    JOptionPane.showMessageDialog(null, 
                    "Forneça apenas valores numéricos\n" + erro.toString());
                }
            }
        });
    }

}
