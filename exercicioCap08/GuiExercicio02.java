package exercicioCap08;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class GuiExercicio02 extends JPanel{
    private String[] paisesOpcoes;
    private JLabel paisLabel, continente, continenteAtual;
    private JComboBox<String> caixaDeOpcoes;
    private String[] continentes = new String[]{"Europa", "America", "Ásia"};


    public GuiExercicio02() {
        inicializarComponente();
        definirEventos();
    }

    private void inicializarComponente() {
        setLayout(null);
        String[] paisesOpcoes = new String[]{"Alemanha", "Brasil", "China", "Espanha", "Portugal"};
        caixaDeOpcoes = new JComboBox<>(paisesOpcoes);
        caixaDeOpcoes.setBounds(25, 15, 150, 25);
        paisLabel = new JLabel();
        continente = new JLabel("Continente: ");
        continente.setBounds(25, 120, 80, 25);
        paisLabel.setBounds(25, 30, 96, 96);
        continenteAtual = new JLabel("segura lugar");
        continenteAtual.setBounds(95, 120, 80, 25);
        add(continenteAtual);
        add(continente);
        add(caixaDeOpcoes);
        add(paisLabel);
    }


    private void definirEventos() {
        caixaDeOpcoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String paisSelecionado = (String) caixaDeOpcoes.getSelectedItem();
                    System.out.println("Pais selecionado: " + paisSelecionado);
                    String caminhoImagem = "C:/Users/tercio.oliveira/IdeaProjects/8JavaED/exercicioCap08/bandeiras/" + paisSelecionado + ".png";
                    System.out.println("Caminho da imagem: " + caminhoImagem);
                    Icon bandeiraIcon = new ImageIcon(caminhoImagem);
                    paisLabel.setIcon(bandeiraIcon);
                    if (paisSelecionado.equals("Alemanha")||paisSelecionado.equals("Espanha")|| paisSelecionado.equals("Portugal")) {
                        continenteAtual.setText(continentes[0]);
                    }else if (paisSelecionado.equals("China")) {
                        continenteAtual.setText(continentes[2]);
                    } else {
                        continenteAtual.setText(continentes[1]);
                    }
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao carregar a imagem: " + erro.toString());
                }
            }
        });
    }

}
