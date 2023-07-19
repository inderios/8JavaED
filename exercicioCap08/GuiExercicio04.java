package exercicioCap08;

import javax.swing.*;
import java.awt.*;


public class GuiExercicio04 extends JPanel{
    private JPanel questionarioPainel, botoesFlow, apresentacaoPanel;
    private JLabel nomeLabel, enderecoLabel, sexoLabel, estadoCivilLabel;
    private JTextField nomeField, enderecoField;
    private JComboBox<String> sexoBox, estadoCivilBox;
    private JButton mostrarButton, limparButton;
    private JTextArea apresentacaoArea;
    private JScrollPane scrollPane;
    private String[] sexoOpcoesArray = new String[] {"Masculino", "Feminino", "Indefinido"};
    private String[] estadoCivilOpcoes = new String[] {"solteiro", "casado", "separado", "divorciado", "viúvo"};
    public GuiExercicio04() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(new BorderLayout());
        //label
        nomeLabel = new JLabel("Nome:");
        enderecoLabel = new JLabel("Endereco:");
        sexoLabel = new JLabel("Sexo:");
        estadoCivilLabel = new JLabel("Estado Civil:");
        //JTextField
        nomeField = new JTextField();
        enderecoField = new JTextField();
        //JComboBox
        sexoBox = new JComboBox<>(sexoOpcoesArray);
        estadoCivilBox = new JComboBox<>(estadoCivilOpcoes);
        //JButton
        mostrarButton = new JButton("Mostrar");
        limparButton = new JButton("Limpar");
        //
        apresentacaoArea = new JTextArea(10, 2);
        scrollPane = new JScrollPane();
        scrollPane.add(apresentacaoArea);
        apresentacaoPanel = new JPanel(new GridLayout(10, 2));
        apresentacaoPanel.add(scrollPane);
        //
        questionarioPainel = new JPanel(new GridLayout(4, 2));
        questionarioPainel.add(nomeLabel);
        questionarioPainel.add(nomeField);
        questionarioPainel.add(enderecoLabel);
        questionarioPainel.add(enderecoField);
        questionarioPainel.add(sexoLabel);
        questionarioPainel.add(sexoBox);
        questionarioPainel.add(estadoCivilLabel);
        questionarioPainel.add(estadoCivilBox);
        botoesFlow = new JPanel(new GridLayout(0, 2));
        botoesFlow.add(mostrarButton);
        botoesFlow.add(limparButton);
        add(questionarioPainel, "North");
        add(botoesFlow, "Center");
        add(scrollPane, "South");
    }
    private void definirEventos() {
    }

}