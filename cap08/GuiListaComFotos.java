package cap08;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class GuiListaComFotos extends JPanel {
    private JList<String> lsFotos;//
    private DefaultListModel<String> dlm;//objeto muito importante somente a declaração dele.
    private ImageIcon image1;
    private JScrollPane sp;
    private JLabel lbImagem;

    public GuiListaComFotos() {
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes() {
        setLayout(null);
        dlm = new DefaultListModel<String>();// criação da do objeto dlm, lista vazia nesse momento
        for (int i = 1; i < 11; i++) {
            dlm.addElement("Foto" + i);
        }//adicionando um novo elemento a a cada repetição;
        lsFotos = new JList<String>(dlm);//cria uma lista com todos os elementos de dlmlista;
        sp = new JScrollPane(lsFotos);
        sp.setBounds(50, 40, 70, 150);
        image1 = new ImageIcon();
        lbImagem = new JLabel(image1);
        lbImagem.setBounds(150, 30, 600, 600);
        add(sp);
        add(lbImagem);
    }
    private void definirEventos() {
        lsFotos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {//muda o valor com cada mudança.
                image1 = new ImageIcon("C:/Users/tercio.oliveira/Pictures/fotos/" + lsFotos.getSelectedValue() + ".jpg");
                lbImagem.setIcon(image1);
            }
        });
    }
}
