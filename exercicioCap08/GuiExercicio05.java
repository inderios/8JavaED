package exercicioCap08;

import javax.swing.*;
import java.awt.*;

public class GuiExercicio05 extends JPanel{
    private JMenuBar exemplos;
    private JMenu arquivosMenu, exemplosMenu;
    private JMenuItem exercicio1Item, exercicio2Item, exercicio3Item, exercicio4Item;
    private JPanel desktopPanel;

    public GuiExercicio05() {
        inicializarComponentes();
        definirEventos();
    }
    public void inicializarComponentes() {
        exemplos = new JMenuBar();
        arquivosMenu = new JMenu("Arquivos");
        exemplos.add(arquivosMenu);
        add(exemplos);
    }
    public void definirEventos() {

    }
}
