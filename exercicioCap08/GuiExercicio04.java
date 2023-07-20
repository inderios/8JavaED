package exercicioCap08;

import javax.swing.*;
import java.awt.*;

public class GuiExercicio04 extends JPanel {
    private JPanel questionarioPainel, painelPrincipalPanel;
    private JLabel nomeLabel, enderecoLabel, sexoLabel, estadoCivilLabel;
    private JTextField nomeField, enderecoField;
    private JComboBox<String> sexoBox, estadoCivilBox;
    private JButton mostrarButton, limparButton;
    private JTextArea apresentacaoArea;
    private JScrollPane scrollPane;
    private final String[] sexoOpcoesArray = new String[] {"Masculino", "Feminino", "Indefinido"};
    private final String[] estadoCivilOpcoes = new String[] {"SOLTEIRO", "CASADO", "SEPARADO", "DIVORCIADO", "VIÚVO"};

    public GuiExercicio04() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(new BorderLayout());

        questionarioPainel = new JPanel(new GridLayout(5, 2));
        nomeLabel = new JLabel("Nome:");
        enderecoLabel = new JLabel("Endereço:");
        sexoLabel = new JLabel("Sexo:");
        estadoCivilLabel = new JLabel("Estado Civil:");
        nomeField = new JTextField();
        enderecoField = new JTextField();
        sexoBox = new JComboBox<>(sexoOpcoesArray);
        estadoCivilBox = new JComboBox<>(estadoCivilOpcoes);
        mostrarButton = new JButton("Mostrar");
        limparButton = new JButton("Limpar");

        questionarioPainel.add(nomeLabel);
        questionarioPainel.add(nomeField);
        questionarioPainel.add(enderecoLabel);
        questionarioPainel.add(enderecoField);
        questionarioPainel.add(sexoLabel);
        questionarioPainel.add(sexoBox);
        questionarioPainel.add(estadoCivilLabel);
        questionarioPainel.add(estadoCivilBox);
        questionarioPainel.add(mostrarButton);
        questionarioPainel.add(limparButton);

        apresentacaoArea = new JTextArea();
        scrollPane = new JScrollPane(apresentacaoArea);

        painelPrincipalPanel = new JPanel(new BorderLayout());
        painelPrincipalPanel.add(questionarioPainel, BorderLayout.NORTH);
        painelPrincipalPanel.add(scrollPane, BorderLayout.CENTER);

        add(painelPrincipalPanel);
    }

    private void definirEventos() {
        mostrarButton.addActionListener(e -> mostrarDados());
        limparButton.addActionListener(e -> limparDados());
    }

    private void mostrarDados() {
        String dados = "Nome: " + nomeField.getText() + "\n"
                + "Endereço: " + enderecoField.getText() + "\n"
                + "Sexo: " + sexoBox.getSelectedItem() + "\n"
                + "Estado Civil: " + estadoCivilBox.getSelectedItem();
        apresentacaoArea.setText(dados);
    }

    private void limparDados() {
        nomeField.setText("");
        enderecoField.setText("");
        sexoBox.setSelectedIndex(0);
        estadoCivilBox.setSelectedIndex(0);
        apresentacaoArea.setText("");
    }
}
