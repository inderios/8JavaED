package cap08;
import java.awt.event.*;
import javax.swing.*;
public class GuiBotao extends JPanel{
    private JButton btMensagem, btTeimoso;
    private ImageIcon imageIcon1;

    public GuiBotao() {
        inicializarComponentes();
        definifirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        imageIcon1 = new ImageIcon(
            "C:/Users/frace/OneDrive/Documentos/GitHub 8JavaE/DispensaDeTesteDeDados/icons8-logo-java-coffee-cup-40.png");
        btMensagem = new JButton("Mensagem", imageIcon1);
        btMensagem.setBounds(50, 20, 140, 38);
        btMensagem.setMnemonic(KeyEvent.VK_M);
        btMensagem.setToolTipText("Clique aqui para ver a mensagem");
        btTeimoso = new JButton("Teimoso");
        btTeimoso.setBounds(50, 70, 100, 25);
        add(btMensagem);
        add(btTeimoso);
    }

    private void definifirEventos() {
        btMensagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão Mensgem");
            }
        });

        btTeimoso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão teimoso");
            }
        });

        btTeimoso.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                btTeimoso.setBounds(50, 120, 100, 25);
            }
            public void mouseExited(MouseEvent e) {
                btTeimoso.setBounds(50, 70, 100, 25);
            }
        });
    }
    
}
/*
 * Botões e eventos do mouse, presta atenção, lidar com esse eventos de mouse foi a coisa nova introduzida a mim
 * O eventos de mouse são importantes aqui apesar de usar apenas dois, entrada e said do mouse, 
 * é apenas para fazer uma brincadeira do botão sumir caso o mouse passe por cima
 * mas isso me dá ideia do que fazer com o mouse...
*/