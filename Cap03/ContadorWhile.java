package Cap03;
import javax.swing.JOptionPane;
public class ContadorWhile {
    public static void main(String args[]) {
        try
        {
            int limite = Integer.parseInt(JOptionPane.showInputDialog("Dígite quantidade: "));
            int contador = limite;
            while (contador >= 0) {
                System.out.println(contador);
                contador--;
            }
            System.out.println("Fim do contador regressivo, usando while()\n");
            contador = 0;
            do {
                System.out.println(contador);
                contador++;
            } while (contador <= limite);
            System.out.println("Fim do contador progressivo, usando do{}while();\n");
        } catch(NumberFormatException erro) /*tratamento de erro que conversão de número, tipo caso seja colocado uma letra invez de um número*/{
            System.out.println("Não foi fornecido um número inteiro válido!\n"
                    + erro.toString());//se o argumento for invalido
        }
        System.exit(0);
    }
}
