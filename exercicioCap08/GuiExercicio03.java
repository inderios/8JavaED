package exercicioCap08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class GuiExercicio03 extends JPanel {
    private JLabel valorVendaLabel, precoFinalLabel;
    private JTextField entradaDinheiroField, saidaDinheiroField;
    private JRadioButton dinheiroRadio, chequeRadio, cartaoRadio;
    private ButtonGroup selecionaMetodoGroup;
    DecimalFormat df = new DecimalFormat("###,###,###,###.0", DecimalFormatSymbols.getInstance(Locale.US));//formatação do valor monetário.

    public GuiExercicio03() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        valorVendaLabel = new JLabel("Valor de venda:");
        precoFinalLabel = new JLabel("Preço final de venda:");
        entradaDinheiroField = new JTextField();
        saidaDinheiroField = new JTextField("!");
        saidaDinheiroField.setEditable(false);
        dinheiroRadio = new JRadioButton("Dinheiro");
        chequeRadio = new JRadioButton("Cheque");
        cartaoRadio = new JRadioButton("Cartão");
        JRadioButton[] grupoPagamento = new JRadioButton[]{dinheiroRadio, chequeRadio, cartaoRadio};
        selecionaMetodoGroup = new ButtonGroup();
        for (JRadioButton botao: grupoPagamento) {
            selecionaMetodoGroup.add(botao);
        }
        valorVendaLabel.setBounds(40, 80, 150, 25);
        precoFinalLabel.setBounds(40, 200, 150, 25);
        entradaDinheiroField.setBounds(160, 80, 100, 25);
        saidaDinheiroField.setBounds(160, 200, 100, 25);
        dinheiroRadio.setBounds(40, 120, 120, 25);
        chequeRadio.setBounds(40, 140, 120, 25);
        cartaoRadio.setBounds(40, 160, 120, 25);

        Object[] coisas = new Object[]{valorVendaLabel, precoFinalLabel, entradaDinheiroField, saidaDinheiroField,
                grupoPagamento[0], grupoPagamento[1], grupoPagamento[2]};

        for(Object coisa: coisas) {
            add((Component) coisa);
        }
    }
    private void definirEventos() {

        dinheiroRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float tarifaDesconto = 0.95f;//desconto
                calcularPrecoFinal(tarifaDesconto);
            }
        });
        chequeRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float tarifaDesconto = 1.05f;//tarifa
                calcularPrecoFinal(tarifaDesconto);
            }
        });
        cartaoRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float tarifaDesconto = 1.1f;//tarifa
                calcularPrecoFinal(tarifaDesconto);
            }
        });
    }
    private void calcularPrecoFinal(float tarifaDesconto) {
        try {
            df.setMaximumFractionDigits(1);
            df.setMinimumFractionDigits(1);
            float valorVenda = Float.parseFloat(entradaDinheiroField.getText());
            float valorSaida = valorVenda * tarifaDesconto;
            saidaDinheiroField.setText(df.format(valorSaida));
        }catch (NumberFormatException ex) {
            saidaDinheiroField.setText("!!!!!!!!");
        }
    }
}
