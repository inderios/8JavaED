package cap08;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;//o caso de estudo desse nosso programa!
public class GuiMascara extends JPanel{
    private JLabel cpfLabel, cnpJLabel, telLabel, cepLabel;
    private JFormattedTextField cpfField, cnpjField, telField, cepField;//declaração do tipo de field que suporta mascaras
    private MaskFormatter cpfFormatter, cnpjFormatter, telFormatter, cepFormatter;//declaração das mascaras
    private JButton mostrarButton;

    public GuiMascara() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        try {
            cpfFormatter = new MaskFormatter("###.###.###-##");
            cnpjFormatter = new MaskFormatter("##.###.###/####-##");
            telFormatter = new MaskFormatter("(###)#####-####");
            cepFormatter = new MaskFormatter("##.###-###");//criaçaõ das mascaras e suas formatações
            setBounds(0, 0, 250, 220);
            setLayout(null);
            cpfLabel = new JLabel("CPF: ");
            cpfLabel.setBounds(15, 20, 100, 20);
            cpfField = new JFormattedTextField(cpfFormatter);
            cpfField.setBounds(50, 20, 100, 20);
            cnpJLabel = new JLabel("CNPJ: ");
            cnpJLabel.setBounds(15, 50, 100, 20);
            cnpjField = new JFormattedTextField(cnpjFormatter);
            cnpjField.setBounds(50, 50, 150, 20);
            telLabel = new JLabel("TEL:");
            telLabel.setBounds(15, 80, 100, 20);
            telField = new JFormattedTextField(telFormatter);
            telField.setBounds(50, 80, 100, 20);
            cepLabel = new JLabel("CEP:");
            cepLabel.setBounds(15, 110, 100, 20);
            cepField = new JFormattedTextField(cepFormatter);
            cepField.setBounds(50, 110, 100, 20);
            mostrarButton = new JButton("Mostrar");
            mostrarButton.setBounds(15, 140, 100, 22);
            add(cpfLabel);
            add(cpfField);
            add(cnpJLabel);
            add(cnpjField);
            add(telLabel);
            add(telField);
            add(cepLabel);
            add(cepField);
            add(mostrarButton);//já sei tudo até aqui
        } catch (ParseException erro) {
            erro.printStackTrace();
        }
    }

    private void definirEventos() {
        mostrarButton.addActionListener(new ActionListener() {//evento para o botão mostrar
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, 
                cpfField.getText() + "\n" + cnpjField.getText() + "\n" + 
                telField.getText() + "\n" + cepField.getText());
                JOptionPane.showMessageDialog(null, cpfField.getText());//todos os textods formatados.
                String cnpjSoNumeros = cnpjField.getText();
                cnpjSoNumeros = cnpjSoNumeros.replace(".", "");
                cnpjSoNumeros = cnpjSoNumeros.replace("/", "");
                cnpjSoNumeros = cnpjSoNumeros.replace("-", "");//maneira de retirar caracters não numericos ou sla.
                JOptionPane.showMessageDialog(null, cnpjSoNumeros);
            }
        });
    }

}
