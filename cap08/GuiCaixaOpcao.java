package cap08;
import java.awt.event.*;
import javax.swing.*;
public class GuiCaixaOpcao extends JPanel{
    private JButton btVerificar, btMarcar,btDesmarcar;
    private JCheckBox ckIngles, ckInformatica;

    public GuiCaixaOpcao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        btVerificar = new JButton("Verificar");
        ckIngles = new JCheckBox("Inglês");
        ckInformatica = new JCheckBox("Informática");
        btMarcar = new JButton("Marcar");
        btDesmarcar = new JButton("Desmarcar");
        setLayout(null);
        add(btVerificar);
        add(ckIngles);
        add(ckInformatica);
        add(btMarcar);
        add(btDesmarcar);
        btVerificar.setBounds(20, 70, 100, 20);
        ckIngles.setBounds(15, 15, 100, 25);
        ckInformatica.setBounds(15, 40, 100, 25);
        btMarcar.setBounds(20, 100, 100, 20);
        btDesmarcar.setBounds(20, 130, 100, 20);
    }

    private void definirEventos() {
        btMarcar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ckInformatica.setSelected(true);
                ckIngles.setSelected(true);
            }
        });
        btDesmarcar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ckInformatica.setSelected(true);
                ckIngles.setSelected(true);
            }
        });
        btVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String selecao = "Selecionados: ";
                if (ckIngles.isSelected()) {
                    selecao += "\nInglês";
                }
                if (ckInformatica.isSelected()) {
                    selecao += "\ninformática";
                }
                JOptionPane.showMessageDialog(null, selecao);
            }
        });
    }
}
/*
 * Caixa de opções a adicionar me parece bastante útil 
 * Diferente do Radio, posso selecionar varias, criou cada uma das caixas "Check box"
 * com intuito de da varias opções em que o usuario possa selecionar mais do que apenas uma marca.
 * Mas importante lembrar Tércio, não foque no Jframe, mas leve o conhecimento, a logica se possivel ser aplicada para outros frames.
 */
