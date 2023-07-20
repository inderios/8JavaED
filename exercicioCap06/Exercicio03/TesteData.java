package exercicioCap06.Exercicio03;

import javax.swing.JOptionPane;

public class TesteData {
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog(null, "Digite uma data ex: dd/mm/aaaa: ");
        JOptionPane.showMessageDialog(null, "Dia: " + Data.getDia(data) + "\nMês: "
         + Data.getMes(data) + "\nAno: " 
         + Data.getAno(data));
    }
}
