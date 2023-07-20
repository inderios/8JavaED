package exercicioCap06.Exercicio01;

import javax.swing.JOptionPane;

public class TesteMes {
    public static void main(String[] args) {
        int mesProcurado =  Integer.parseInt(JOptionPane.showInputDialog("Digite um mês."));
        int linguagem = Integer.parseInt(JOptionPane.showInputDialog("1: para português/ 2: para inglês"));
        JOptionPane.showMessageDialog(null, Mes.getMesPorExtenso(mesProcurado, linguagem));
    }
}
