package cap08;
import java.awt.event.*;
import javax.swing.*;
public class GuiDialogoConfirmacao extends JPanel{

    private JButton btMostrar;
    private JRadioButton radioButton1, radioButton2, radioButton3;
    private ButtonGroup buttonGroup;
    public GuiDialogoConfirmacao() {
        definirEventos();
        inicializarComponentes();
    }

    private void definirEventos() {
        setLayout(null);
        btMostrar = new JButton("Mostrar");
        radioButton1 = new JRadioButton("Sim e Não");
        radioButton2 = new JRadioButton("Sim, Não e Cancelar");
        radioButton3 = new JRadioButton("Ok e Cancelar");//criação de botões radio, para exibir as caixas de mensagens.
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);//adicionam os botões radio a um grupo.
        radioButton1.setBounds(55, 10, 200, 25);
        radioButton2.setBounds(55, 30, 200, 35);
        radioButton3.setBounds(55, 60, 200, 25);
        btMostrar.setBounds(55, 90, 100, 20);
        add(btMostrar);
        add(radioButton1);
        add(radioButton2);
        add(radioButton3);
    }

    private void inicializarComponentes() {
        btMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int resp = 0;
                if (radioButton1.isSelected()) {//verifica se o botão radioButton1 está selecionado.
                    resp = JOptionPane.showConfirmDialog(null, "Erro ao acessar arquivo. " +
                     "Tentar novamente?", "Erro de arquivo", JOptionPane.YES_NO_OPTION,
                      JOptionPane.ERROR_MESSAGE);//um exemplo se a caixa de dialogo ira conter as opções Yes or No, a mesma lógica se aplica em exemplos diferentes
                } else if (radioButton2.isSelected()) {
                    resp = JOptionPane.showConfirmDialog(null, "Deseja salvar as alterações?", 
                    "Salvar o arquivo", JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
                } else {
                    resp = JOptionPane.showConfirmDialog(null, "Deseja abrir o arquivo?", 
                    "Abrir arquivo", JOptionPane.OK_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
                }//serve para mostra os varios exemplos do showComfirmDialog.
                JOptionPane.showMessageDialog(null, resp, "Resposta", 1);//caixa que apresenta a opção escolhida pelo usuario.
            }
        });
    }
    
}
