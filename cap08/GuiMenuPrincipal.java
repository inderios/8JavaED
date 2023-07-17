package cap08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiMenuPrincipal extends JFrame {
    private JDesktopPane contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao, miCaixaOpcao, miListaComFotos, 
    miRadio, miLista, miLabel, miCombo, miDialogoMensagens, miAreaDeTexto, 
    miDialogoConfirmacao, miDialogoOpcao, miBarraRolagem, miBarraProgresso,
    miAbas, miFrameInterno;
    public GuiMenuPrincipal(){
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 250, 200);
        contentPane = new JDesktopPane();
        setContentPane(contentPane);
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
        miListaComFotos = new JMenuItem("Lista Com Fotos");
        miLista = new JMenuItem("Lista");
        miRadio = new JMenuItem("Radio");
        miLabel = new JMenuItem("Labels");
        miCombo = new JMenuItem("Combo Box");
        miDialogoMensagens = new JMenuItem("Dialogo Mensagens");
        miAreaDeTexto = new JMenuItem("Area de Texto");
        miDialogoConfirmacao = new JMenuItem("Dialogo Confirmação");
        miDialogoOpcao = new JMenuItem("Dialogo Opcão");
        miBarraRolagem = new JMenuItem("Barra de rolagem");
        miBarraProgresso = new JMenuItem("Barra de progresso");
        miAbas = new JMenuItem("Abas");
        miFrameInterno = new JMenuItem("Menu interno");

        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);
        mnExemplos.add(miCaixaOpcao);
        mnExemplos.add(miListaComFotos);
        mnExemplos.add(miRadio);
        mnExemplos.add(miLista);
        mnExemplos.add(miLabel);
        mnExemplos.add(miCombo);
        mnExemplos.add(miDialogoMensagens);
        mnExemplos.add(miAreaDeTexto);
        mnExemplos.add(miDialogoConfirmacao);
        mnExemplos.add(miDialogoOpcao);
        mnExemplos.add(miBarraRolagem);
        mnExemplos.add(miBarraProgresso);
        mnExemplos.add(miAbas);
        mnExemplos.add(miFrameInterno);
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
        miListaComFotos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiListaComFotos guiListaComFotos = new GuiListaComFotos();
                contentPane.removeAll();
                contentPane.add(guiListaComFotos);
                contentPane.validate();
            }
        });
        miLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiLista lista = new GuiLista();
                contentPane.removeAll();
                contentPane.add(lista);
                contentPane.validate();
            }
        });
        miLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiLabel guiLabel = new GuiLabel();
                contentPane.removeAll();
                contentPane.add(guiLabel);
                contentPane.validate();
            }
        });
        miCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiCombo guiCombo = new GuiCombo();
                contentPane.removeAll();
                contentPane.add(guiCombo);
                contentPane.validate();
            }
        });
        miAreaDeTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAreaDeTexto guiAreaDeTexto = new GuiAreaDeTexto();
                contentPane.removeAll();
                contentPane.add(guiAreaDeTexto);
                contentPane.validate();
            }
        });
        miDialogoMensagens.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiDialogoMensagens guiDialogoMensagens = new GuiDialogoMensagens();
                contentPane.removeAll();
                contentPane.add(guiDialogoMensagens);
                contentPane.validate();
            }
        });

        miDialogoConfirmacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiDialogoConfirmacao guiDialogoConfirmacao = new GuiDialogoConfirmacao();
                contentPane.removeAll();
                contentPane.add(guiDialogoConfirmacao);
                contentPane.validate();
            }
        });
        miDialogoOpcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiDialogoOpcao guiDialogoOpcao = new GuiDialogoOpcao();
                contentPane.removeAll();
                contentPane.add(guiDialogoOpcao);
                contentPane.validate();
            }
        });

        miBarraRolagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiBarraRolagem guiBarraRolagem = new GuiBarraRolagem();
                contentPane.removeAll();
                contentPane.add(guiBarraRolagem);
                contentPane.validate();
            }
        });
        miBarraProgresso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiBarraProgresso guiBarraProgresso = new GuiBarraProgresso();
                contentPane.removeAll();
                contentPane.add(guiBarraProgresso);
                contentPane.validate();
            }
        });

        miAbas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiAbas guiAbas = new GuiAbas();
                contentPane.removeAll();
                contentPane.add(guiAbas);
                contentPane.validate();
            }
        });

        miFrameInterno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiFrameInterno guiFrameInterno = new GuiFrameInterno();
                contentPane.removeAll();
                contentPane.add(guiFrameInterno);
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