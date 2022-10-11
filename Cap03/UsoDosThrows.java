package Cap03;
import java.io.*;
import javax.swing.JOptionPane;
public class UsoDosThrows {
    public static void main(String[] args) throws IOException { // o erro não sera tratado no main
        String frase = JOptionPane.showInputDialog("Entre com uma frase:");
        try {
            //criaçã de um arquivo txt, caso já exista somente será aberto, pra isso serve o true.
            FileWriter file = new FileWriter("c:/temp/frases.txt", true);
            //responsavel por enviar as frases do arquivo para file
            PrintWriter out = new PrintWriter(file);
            //ensere no final do arquivo a frase
            out.println(frase);
            //fecha objetos terminando a comunicação
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo!");
        } catch (FileNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Erro, verifique se a pasta c:/temp existe!");
        }
        System.exit(0);
    }
}