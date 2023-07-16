package cap08.layouts;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
public class LayoutTestes extends JPanel{
    private JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;
    private TextField tField;
    
    public LayoutTestes() {
        inicializarComponentesBorderLayout();
    }

    private void inicializarComponentesFlowLayout() {
        
        setLayout(new FlowLayout(0, 20, 40));
        jButton1 = new JButton("Botão 1");
        jButton2 = new JButton("Botão 2");
        jButton3 = new JButton("Botão 3");
        jButton4 = new JButton("Botão 4");
        jButton5 = new JButton("Botão 5");
        jButton6 = new JButton("Botão 6");
        setBackground(Color.CYAN);
        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jButton4);
        add(jButton5);
        add(jButton6);
    }

    private void inicializarComponentesGridLayout() {
        setLayout(new GridLayout(3, 2, 6,6));
        jButton1 = new JButton("Botão 1");
        jButton2 = new JButton("Botão 2");
        jButton3 = new JButton("Botão 3");
        jButton4 = new JButton("Botão 4");
        jButton5 = new JButton("Botão 5");
        jButton6 = new JButton("Botão 6");
        setBackground(Color.MAGENTA);
        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jButton4);
        add(jButton5);
        add(jButton6);//indicado para deixar uniforme.
    }

    private void inicializarComponentesBorderLayout() {
        setLayout(new BorderLayout(6,6));//somente espaçamento vertical e horizontal serve para o tamanho da divisioria.
        jButton1 = new JButton("Superior");
        jButton2 = new JButton("Inferior");
        jButton3 = new JButton("Esquerda");
        jButton4 = new JButton("Direita");
        jButton5 = new JButton("Centro");
        tField = new TextField();
        setBackground(Color.darkGray);
        add("North", jButton1);
        add("South", jButton2);
        /*add("West", jButton3);
        /add("East", jButton4);
        add("Center", jButton5);*/ 
        add(tField);
        //peculiaridade é necessario dizer onde o botão vai ficar numa das 5 posições.
        //existe também a opção de ignorar algunas areas e simplesmente usar as necessárias.
    }


    
}
