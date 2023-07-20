package exercicioCap08;

import cap08.GuiMenuPrincipal;

import javax.swing.*;
import java.awt.*;

public class GuiExercicio05 extends JFrame{
    private Container conteudoContainer;
    private JMenuBar exemplos;
    private JMenu arquivosMenu, exemplosMenu;
    private JMenuItem exercicio1Item, exercicio2Item, exercicio3Item, exercicio4Item;

    public GuiExercicio05() {
        inicializarComponentes();
        definirEventos();
    }
    public void inicializarComponentes() {
        setTitle("Nome");
        setBounds(0, 0, 400, 400);

        conteudoContainer = getContentPane();
        exemplos = new JMenuBar();
        arquivosMenu = new JMenu("Arquivos");
        exemplosMenu = new JMenu("Exemplos");

        exercicio1Item = new JMenuItem("Países");
        exercicio2Item = new JMenuItem("Tabuleiro");
        exercicio3Item = new JMenuItem("Cadastro");
        exercicio4Item = new JMenuItem("Vendas");

        arquivosMenu.add(exercicio1Item);
        arquivosMenu.add(exercicio2Item);
        arquivosMenu.add(exercicio3Item);
        arquivosMenu.add(exercicio4Item);

        exemplos.add(exemplosMenu);
        exemplos.add(arquivosMenu);
        setJMenuBar(exemplos);
    }
    public void definirEventos() {
        exercicio1Item.addActionListener(clique -> chamarPaises());
        exercicio2Item.addActionListener(clique -> chamarTabuleiro());
        exercicio3Item.addActionListener(clique -> chamarCadastro());
        exercicio4Item.addActionListener(clique -> chamarVendas());

    }

    private void chamarPaises() {
        GuiExercicio02 paises = new GuiExercicio02();
        conteudoContainer.removeAll();
        conteudoContainer.add(paises);
        conteudoContainer.validate();
    }
    private void chamarTabuleiro() {
        GuiExercicio01 tabuleiro = new GuiExercicio01();
        conteudoContainer.removeAll();
        conteudoContainer.add(tabuleiro);
        conteudoContainer.validate();
    }
    private void chamarCadastro() {
        GuiExercicio04 cadastro = new GuiExercicio04();
        conteudoContainer.removeAll();
        conteudoContainer.add(cadastro);
        conteudoContainer.validate();
    }
    private void chamarVendas() {
        GuiExercicio03 vendas = new GuiExercicio03();
        conteudoContainer.removeAll();
        conteudoContainer.add(vendas);
        conteudoContainer.validate();
    }
    public static void abrir() {
        GuiExercicio05 frame = new GuiExercicio05();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
}

