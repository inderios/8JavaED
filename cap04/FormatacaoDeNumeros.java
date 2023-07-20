package cap04;
import java.text.DecimalFormat;
public class FormatacaoDeNumeros {
    public static void main(String[] args) {
        DecimalFormat forma = new DecimalFormat();
        short idade = 38;
        forma.applyPattern("000");
        System.out.println(forma.format(idade));

        int quantidade = 9750;
        forma.applyPattern("#0,000");
        System.out.println(forma.format(quantidade));

        long estoque = 198564;
        forma.applyPattern("#,##0,000");
        System.out.println(forma.format(estoque));

        float altura = 1.74f;
        forma.applyPattern("#0.00");
        System.out.println(forma.format(altura));

        double peso = 70.25;
        forma.applyPattern("#0.00");
        System.out.println(forma.format(peso));
        String valorEmReais = "2583.75";
        forma.applyPattern("R$ #,##0.00"); // , virgula se torna ponto e virce-versa.
        System.out.println(forma.format(Double.parseDouble(valorEmReais)));
    }
}
