package cap08;
import javax.swing.*;
import java.awt.event.*;
public class GuiAreaDeTexto extends JPanel{
    private JTextField tfCampo;
    private JTextArea taTexto;//declaração da area de digitação
    private JScrollPane scrollPane;
    private JButton btLimpar;
    private final static String novalinha = "\n";//novalinha serve para quebrar alinha no objeto taTexto.

    public GuiAreaDeTexto() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        tfCampo = new JTextField();
        taTexto = new JTextArea(5, 20);//o texto tem cinco linhas e 20 colunas, mas é desnessaário já que os layouts serão definidos por setBounds
        taTexto.setEditable(false);
        btLimpar = new JButton(new ImageIcon("C:/Users/frace/OneDrive/Documentos/GitHub 8JavaE/DispensaDeTesteDeDados/eraser.PNG"));//criação do botão limpar com uma imagem borracha
        scrollPane = new JScrollPane(taTexto);//visualizar o resto do texto quando não houver mais espaço todas a linhas.
        tfCampo.setBounds(25, 15, 150, 25);
        scrollPane.setBounds(25, 45, 300, 120);
        btLimpar.setBounds(25, 170, 50, 50);
        add(tfCampo);
        add(scrollPane);
        add(btLimpar);
    }

    private void definirEventos() {
        tfCampo.addActionListener(new ActionListener() {//ação aconteçera quando eu clicar enter com o curso dentro da caixa
            public void actionPerformed(ActionEvent e) {
                tfCampo.selectAll();//seleciona todo o campo
                taTexto.append(tfCampo.getText() + novalinha);//add a taCampo a linha de tfCampo.
                taTexto.setCaretPosition(taTexto.getDocument().getLength());
            }
        });
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfCampo.setText(" ");
                taTexto.setText(" ");
            }//limpa os campo tfCAmpo e tfTexto de qualquer texto.
        });
    }
}
