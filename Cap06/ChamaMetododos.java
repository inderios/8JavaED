package Cap06;

import javax.swing.JOptionPane;

public class ChamaMetododos {
    public static void main(String[] args) {
        String nome = EntradaDeDadosComMetodos.lerString("Forneça seu nome");
        int idade = EntradaDeDadosComMetodos.lerNumeroInt(0, 120, "Forneça sua idade");
        float alturaa = EntradaDeDadosComMetodos.lerNumeroFloat(0, 2.5f, "Forneça sua altura");
        double peso = EntradaDeDadosComMetodos.lerNumeroDouble(0, 300, "Forneça seu peso");
        char op = EntradaDeDadosComMetodos.selecionarOpcao("Você gosta de java?");
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + alturaa + "\nPeso: " + peso + "\nOpção selecionada: " + op);
    }
}
