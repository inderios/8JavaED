package cap08;
import java.awt.*;
import javax.swing.*;
public class GuiAbas extends JPanel {
    private JTabbedPane tpAbas;//declaração da tpAbas.
    private JButton[] botoes = new JButton[15];//botoões que server de exemplo para abas.

    public GuiAbas() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setLayout(null);
        for (int i = 0; i < 15; i++) {
            botoes[i] = new JButton("Botão " + (i + 1));
        }//loop para criação de botoões apenas adicionas um para diferencialos.
        JPanel panel1 = new JPanel(new GridLayout(5, 1));//declaração e inicilização do gridlayer, cinco linhas e uma coluna.
        for (int i = 0; i < 5; i++) {
            panel1.add(botoes[i]);
        }
        JPanel panel2 = new JPanel(new FlowLayout());//declaração e criação do Flowlayout.
        for (int i = 5; i < 10; i++) {
            panel2.add(botoes[i]);
        }
        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.add(botoes[10], "North");
        panel3.add(botoes[11], "West");
        panel3.add(botoes[12], "Center");
        panel3.add(botoes[13], "East");
        panel3.add(botoes[14], "South");
        tpAbas = new JTabbedPane();//criação do objeto tpAbas, esqueceu isso maluco!
        tpAbas.add("GridLayout", panel1);
        tpAbas.add("FlowLayout", panel2);
        tpAbas.add("BorderLayout", panel3);//adiciona cada um dos paneis ao abas
        tpAbas.setBounds(0,0,300,200);
        add(tpAbas);//adiciona abas ao painel.
    }
}
