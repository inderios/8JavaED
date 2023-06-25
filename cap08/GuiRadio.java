package cap08;
import java.awt.event.*;
import javax.swing.*;
public class GuiRadio extends JPanel{
    private JLabel lbSexo;
    private JButton btVerificar;
    private JRadioButton rbMasculino, rbFeminino;//declaração de objetos rbMasculino e rbFeminino, sendo do tipo de JRadioButton
    private ButtonGroup buttonGroup;//declaração de um objeto buttonGroup como sendo do tipo ButtonGrup // grupo para botão de radio.

    public GuiRadio() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        btVerificar = new JButton("Verificar"); //criando um botão rádio com um texto
        rbMasculino = new JRadioButton("Masculino");
        lbSexo = new JLabel("Selecione o sexo: ");
        rbFeminino = new JRadioButton("Feminino");//18-20 dois objetos do tipo JRadioButton com texto associado
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rbMasculino);
        buttonGroup.add(rbFeminino);//21-23 criação do objeto buttonGroup e a adição de objetos a ele.
        btVerificar.setBounds(55, 105, 100, 20);
        rbMasculino.setBounds(55, 45, 100, 25);
        lbSexo.setBounds(55, 10, 105, 30);
        rbFeminino.setBounds(55, 70, 100, 25);
        rbMasculino.setSelected(true);//o botão rbMasculino seja selecionado por meio to método setSelected
        add(btVerificar);
        add(rbMasculino);
        add(lbSexo);
        add(rbFeminino);
    }

    private void definirEventos() {
        btVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (rbMasculino.isSelected()) {//serve para ver se o botão tá selecionado, em caso positivo mostra a mensagem
                    JOptionPane.showMessageDialog(null, "Masculino selecionado");
                } else if (rbFeminino.isSelected()) {//idem da linha 38, somente teste com rbFeminino.
                    JOptionPane.showMessageDialog(null, "Feminino selecionado");
                }
            }
        });
    }
}
//nota: é uma opção onde apenas um pode está selecionado!
/*
 * Bom trabalho avançou bastante com seus estudo pelo livro Tércio, não se esqueça de estudar os conteúdos de matemática
 * Ao resumo sobre o codigo acima:
 * Aprendi sobre JRadio, é tipo uma caixa de escolhas onde só é possivel uma opção
 * no exemplo acima, fizemos duas exemplos, masculino e feminino e o usuario poderia marca um
 * e logo depois um botão, verificar fazia surgi uma caixa de dialogo apresentado qual opção estava selecionada.
 * Bom trabalho.
*/