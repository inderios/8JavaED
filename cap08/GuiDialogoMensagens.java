package cap08;
import java.awt.event.*;
import javax.swing.*;
public class GuiDialogoMensagens extends JPanel{
    private ImageIcon imageIcon1;
    private JComboBox<String> cbCaixas;

    public GuiDialogoMensagens() {
        definirEventos();
        inicializarComponentes();
    }

    private void definirEventos() {
        setLayout(null);
        imageIcon1 = new ImageIcon("C:/Users/frace/OneDrive/Documentos/GitHub 8JavaE/DispensaDeTesteDeDados/giphy.gif");
        String[] cbCaixasItens = {"Pergunta", "Informação", "Alerta", "Erro",
         "definida pelo usuário", "Somente Mensagem"}; //criação das opções disponiveis na caixadeDialogo.
        cbCaixas = new JComboBox<String>(cbCaixasItens);//cria os objetos com os itens da caixa.
        cbCaixas.setBounds(25, 40, 150, 25);
        add(cbCaixas);
    }

    private void inicializarComponentes() {
        cbCaixas.addActionListener(new ActionListener() { //quando o usuario selecionar um das opções na caixa de dialogo uma dessas opções ira aparecer.
            public void actionPerformed(ActionEvent e) {
                switch (cbCaixas.getSelectedIndex()) { //getSelectedIndex faz cada uma das linhas funcionar de acordo com ela pronto.
                    case 0:
                        JOptionPane.showMessageDialog(null, "Estou aprendendo Java?",
                         "Pergunta", JOptionPane.QUESTION_MESSAGE);
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Gravação ok.",
                         "Informação", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Cuidado!",
                         "Alerta", JOptionPane.WARNING_MESSAGE);
                        break; 
                    case 3:
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro",
                         "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Usando um gif animado",
                         "Personalizado", JOptionPane.INFORMATION_MESSAGE, imageIcon1);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Caixa de mensagens simples",
                         "Somente mensagem", JOptionPane.PLAIN_MESSAGE);
                        break;   
                }
            }
        });
    }
}
