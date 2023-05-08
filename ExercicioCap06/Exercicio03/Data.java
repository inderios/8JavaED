package ExercicioCap06.Exercicio03;

import javax.swing.JOptionPane;

public class Data {
    public static int getDia(String data) {
        int[] dataLista = convertoVerificador(data);
        return dataLista[0];
    }
    public static int getMes(String data) {
        int[] dataLista = convertoVerificador(data);
        return dataLista[1];
    }
    public static int getAno(String data) {
        int[] dataLista = convertoVerificador(data);
        return dataLista[2];
    }
    public static int[] convertoVerificador(String data) {
        try{
            String[] dataLista = data.split("/");
            int[] dataInt = new int[dataLista.length];
            for (int i = 0; i < dataLista.length; i++) {
                dataInt[i] = Integer.parseInt(dataLista[i]);
            }
            if ( dataInt[0] < 1 || dataInt[0] > 31) { //dias
                dataInt[0] = 0; 
            } else if (dataInt[1] < 1 || dataInt[1] > 12) { //mes
                dataInt[1] = 0;
            }else if (dataInt[2] < 0 || dataInt[2] > 9999) {//ano
                dataInt [2] = 0;
            }
            return dataInt;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,e);
            return new int[]{0, 0, 0};
        }
    }
}
/**
 * Crie uma classe chamada Data que contenha os métodos getDia, getMes e getAno.
 * Esses métodos recebem uma data em formato texto no padrão "dd/mm/aaaa" e retornam um número inteiro
 * correspondete ao dia, mês e ano existentes na data fornecida.
 * Caso a data enviada esteja fora do padrão, os método, deve retorna o valor zero.
 * Faça também outra classe para testar o método.
 */