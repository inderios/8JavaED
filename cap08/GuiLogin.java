package cap08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiLogin extends JFrame {
    private JTextField tfLogin;
    private JLabel jbSenha;
    private JLabel jbLogin;
    private JButton btLogar;
    private JButton btCancelar;
    private JPasswordField pfSenha;
    private static GuiLogin frame;

    public GuiLogin() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Login no sistema");
        setBounds(0,0,250,200);
        setLayout(null);
        tfLogin = new JTextField(5);
        pfSenha = new JPasswordField(5);
        jbSenha = new JLabel("Senha: ");
        jbLogin = new JLabel("Login: ");
        btLogar = new JButton("Logar");
        btCancelar = new JButton("Cancelar");
        tfLogin.setBounds(100, 30, 120, 25);
        jbLogin.setBounds(30, 30, 80, 25);
        jbSenha.setBounds(30, 75, 80, 25);
        pfSenha.setBounds(100, 75, 120, 25);
        btLogar.setBounds(20, 120, 100, 25);
        btCancelar.setBounds(125, 120, 100, 25);
        add(tfLogin);
        add(jbSenha);
        add(jbLogin);
        add(btLogar);
        add(btCancelar);
        add(pfSenha);
    }

    private void definirEventos() {

        btLogar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String senha = String.valueOf(pfSenha.getPassword());
                if (tfLogin.getText().equals("java8") && senha.equals("java8")) {
                    frame.setVisible(false);
                    GuiMenuPrincipal.abrir();
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretas!");
                }
            }
        });

        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new GuiLogin();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
                frame.setVisible(true);
            }
        });
    }
}
/*
 * Ainda bem eu tive a ideia de me perguntar qual era o proposito, o que cada capitulo queria me ensinar
 * Bem ao seguinte resumo desse programa, qual era o objetivo o que ele queria que eu aprende-se?
 * GuiLogin, só intuição minha, mas creio que seja para aprender a lidar com informaçõe fornecidas pelo o usuario
 * Fim, por hoje é só, Tércio vai tomar banho e arrumar a vida, e só
 * Essa jornada na programação é gostosa e divertida, estou aprendendo a montar um quebra cabela complexo
 * Apesar de que quebra cabeças já tem um fim em sí, enquanto programação é mais uma explorção 
 * um jeito de colocar diferentes peças para fazer tudo trabalhas junto.
 * Bem boa noite, são 00: 32 e por fim termino meu resumo de hoje, não desista Tércio.
*/