package cap08;
import java.awt.event.*;
import javax.swing.*;
public class GuiBarraProgresso extends JPanel{
    private JProgressBar pbInstalar;//declaração da barra de progresso.
    private JButton btAumentar, btDiminuir;
    public GuiBarraProgresso() {
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes() {
        setLayout(null);
        pbInstalar = new JProgressBar();//criação do objeto instalar.
        pbInstalar.setBounds(50, 10, 100, 20);
        btAumentar = new JButton("Aumentar");
        btAumentar.setBounds(50, 50, 100, 25);
        btAumentar.setMnemonic('A');
        btDiminuir = new JButton("Diminuir");
        btDiminuir.setBounds(50, 100, 100, 25);
        btDiminuir.setMnemonic('D');
        add(pbInstalar);
        add(btAumentar);
        add(btDiminuir);
    }
    private void definirEventos() {
        btAumentar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pbInstalar.setValue(pbInstalar.getValue() + 5);//dois métodos da JSScrollBar, set value e get value.
            }
        });//quando usuario clicar no botão aumentar o valor vai ser aumentao em cinco.
        btDiminuir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pbInstalar.setValue(pbInstalar.getValue() - 5);
            }
        });//mesma coisa que o codigo anterior, a diferença é que diminui em cinco o valor.
    }
}
