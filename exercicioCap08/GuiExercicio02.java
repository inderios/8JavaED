package exercicioCap08;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class GuiExercicio02 extends JPanel{
    private JLabel paisLabel, continente, continenteAtual;
    private JComboBox<String> caixaDeOpcoes;
    private String[] continentes = new String[]{"Europa", "America", "Ásia"};
    private String[] paisesOpcoes = new String[]{"Alemanha", "Brasil", "China", "Espanha", "Portugal"};
    private Map<String, String> paisPorContinente;
    public static void main(String[] args) {
        JFrame frame = new JFrame ("BANDEIRAS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GuiExercicio02());//apenas mude apos o new para testar o frame.
        frame.setBounds(0,  0, 500, 430);
        frame.setVisible(true);
    }

    public GuiExercicio02() {
        inicializarComponente();
        definirEventos();
    }

    private void inicializarComponente() {
        setLayout(null);
        paisPorContinente = new HashMap<>();
        paisPorContinente.put(paisesOpcoes[0], continentes[0]);
        paisPorContinente.put(paisesOpcoes[3], continentes[0]);
        paisPorContinente.put(paisesOpcoes[4], continentes[0]);
        paisPorContinente.put(paisesOpcoes[1], continentes[1]);
        paisPorContinente.put(paisesOpcoes[2], continentes[2]);
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
                    String caminhoImagem = "exercicioCap08/bandeiras/" +
                            paisSelecionado + ".png";
                    System.out.println("Caminho da imagem: " + caminhoImagem);
                    Icon bandeiraIcon = new ImageIcon(caminhoImagem);
                    paisLabel.setIcon(bandeiraIcon);

                    String continenteSelecionado = paisPorContinente.get(paisSelecionado);
                    System.out.println(paisSelecionado.toString());
                    continenteAtual.setText(continenteSelecionado);

                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao carregar a imagem: " + erro.toString());
                }
            }
        });
    }
}
