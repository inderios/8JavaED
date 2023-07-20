package exercicioCap03;
import javax.swing.JOptionPane;
public class Exercicio03 {
    public static void main(String[] args) {
        try{
            for(int chance = 3; chance > 0; chance--) {
                String usuarioSenha = "Java8";
                String usuario = JOptionPane.showInputDialog(null, "Login : ");
                String senha = JOptionPane.showInputDialog(null, "Senha : ");
                if (senha.equals(usuarioSenha) && usuario.equals(usuario)) {
                    JOptionPane.showMessageDialog(null, "Login e senha aceitos");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Falha, verifique login e senha!\n" +
                            "Você tem mais " + (chance - 1) + " tentativa(s)!\n");
                }
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Não sei o que deu errado só sei que deu, se vira, " +
                    "erro : "
                    + erro.getMessage());
            erro.printStackTrace();
        }
        System.exit(0);
    }
}
