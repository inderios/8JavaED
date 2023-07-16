package cap08;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GuiCombo extends JPanel {
    private JComboBox<String> cbEstados;//combo box estado, apenas uma declaração
    private JLabel lbEstados;
    private JButton btMostrar;

    public GuiCombo(){
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes() {
        setLayout(null);
        String[] cbEstadosItens = {"Espírito Santos", "Minas Gerais", "Rio de Janeiro", "São Paulo"};//a declaração das opções que irão aparecer no cb
        cbEstados = new JComboBox(cbEstadosItens);//inicialização e criação a parti dos elementos que existem no cbEstadosItens.
        lbEstados = new JLabel("Estados do Sudeste: ");
        btMostrar = new JButton("Mostrar");
        add(lbEstados);
        add(cbEstados);
        add(btMostrar);
        lbEstados.setBounds(25, 15, 150, 25);
        cbEstados.setBounds(25, 40, 150, 25);
        btMostrar.setBounds(25, 75, 100, 25);
    }
    //quando o usuario clicar no botão mostrar que vai mostrar o index do estado selecionado e o nome.
    private void definirEventos() {
        btMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Indice selecionado: " + cbEstados.getSelectedIndex()//mostra o indice selecionado
                                + "\nTexto Selecionado: " + cbEstados.getSelectedItem());//mostra o texto selecionado atualmente.
            }
        });
    }
}
