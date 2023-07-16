package cap08;
import java.awt.event.*;
import javax.swing.*;
public class GuiDialogoOpcao extends JPanel{
    private JButton btAbrir;
    private JLabel lbResposta;

    public GuiDialogoOpcao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        lbResposta = new JLabel("");
        btAbrir = new JButton("Abrir");
        btAbrir.setBounds(25, 30, 100, 25);
        lbResposta.setBounds(25, 60, 200, 25);
        add(btAbrir);
        add(lbResposta);
    }

    private void definirEventos() {
        btAbrir.addActionListener(new ActionListener() {//ação sobre o botão abrir
            public void actionPerformed(ActionEvent arg0) {
                String[] escolha = {"Masculino", "Feminino", "FUTANARI"};//opções de escolha, elementos de escolha o futanari foi minha criação
                String localSexo = "C:/Users/frace/OneDrive/Documentos/GitHub 8JavaE/DispensaDeTesteDeDados/sexo.gif";
                int resp = JOptionPane.showOptionDialog(null, "Escolha o sexo", 
                "Sexo", 1, JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(localSexo), escolha, escolha[0]);//destaque desse código, o Uso do showInputDialog, null serve para usar o deslocamento padrão, Mensagem, titulo, tipo de opção, 
                lbResposta.setText("Sexo Escolhida: " + escolha[resp]);
            }
        });
    }
}
