package cap08;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;//é preciso para formata o numero no final para ter dois digitos no minino e no máximo
public class GuiBarraRolagem extends JPanel {
    private JScrollBar scrollBar;//declaração do tópico desse programa!
    private JLabel lbCentimetros, lbPolegadas;

    public GuiBarraRolagem() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 5, 0, 105);//criaçaõ e inicilização do scroll bar, no primeiro temos o valor horizontal e vertical, o valor inicial da barra de rolagem, o incremento ou decremento quando o usuario clicar na area contraria, min e max da barra. 
        lbPolegadas = new JLabel("0 Polegadas", JLabel.CENTER);
        lbCentimetros = new JLabel("0.00 Centimetros", JLabel.CENTER);
        scrollBar.setBounds(25, 20, 180, 25);
        lbPolegadas.setBounds(35, 50, 150, 25);
        lbCentimetros.setBounds(35, 80, 150, 25);
        add(scrollBar);
        add(lbCentimetros);
        add(lbPolegadas);
    }

    private void definirEventos() {
        scrollBar.addAdjustmentListener(new AdjustmentListener() {//quando o usuario clica sobre a barra de valor e a mudar, por meio da interface AdjustmentListener, que especifica o método adjusmentValue Changed.
            public void adjustmentValueChanged(AdjustmentEvent e) {
                lbPolegadas.setText(scrollBar.getValue() + " Polegadas");//define o texto de polegadas, pelo método setText
                NumberFormat nf = NumberFormat.getNumberInstance();//o import anterior , ajuda formata o numero aparece somente com duas casas decimais.
                nf.setMinimumFractionDigits(2);
                nf.setMaximumFractionDigits(2);//set mininum e set maxima
                double cm = scrollBar.getValue() * 2.54;//declara e inicializa centimetros, pegar o valor da barra que está em polegadas, e multiplicar por 2.54, para converete em centimetros
                lbCentimetros.setText(nf.format(cm) + " Centimetros");//set o texto para a labelCentimetros, formata para cm, com o numberformat ele deixa apenas com duas casa unitarias pos virgula, e o texto de centimetros.
            }
        });
    }

}
