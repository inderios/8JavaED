package cap08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiMenuPrincipal extends JFrame {
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao, miCaixaOpcao;
    
    public GuiMenuPrincipal(){
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 250, 200);
        contentPane = getContentPane();
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');
        miSair = new JMenuItem("Sair", new ImageIcon("sair.jpg"));
        miSair.setAccelerator(KeyStroke.getKeyStroke(
            KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miBotao = new JMenuItem("Botão");
        miCaixaOpcao = new JMenuItem("Caixa de Opção");
        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);
        mnExemplos.add(miCaixaOpcao);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        setJMenuBar(mnBarra);
    }

    private void definirEventos() {
        miSair.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                System.exit(0);
            }
        });

        miBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiBotao botao = new GuiBotao();
                contentPane.removeAll();
                contentPane.add(botao);
                contentPane.validate();
            }
        });
        miCaixaOpcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiCaixaOpcao guiCaixaOpcao = new GuiCaixaOpcao();
                contentPane.removeAll();
                contentPane.add(guiCaixaOpcao);
                contentPane.validate();
            }
        });
    }

    public static void abrir() {
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2,
         (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
}
/*
 * Esse código apesar de fazer um tempo, merece atenção pois é a introdução;
 * Não posso deixar a preguiça tomar conta de mim
 * Esse programa foi focado na ajuda de criação de menus, apesar de ter muita coisa.
 * criando o mnBarrar, o local onde os menus propriadamente ditos serão postos.
 * e dentro desses menus os itens, a lógica se repete em todo frame criado no livro
 * primeirametne ele inicia cada um dos elementos na tela, logo depois, cria os eventos que 
 * estão associados aos botões.
*/