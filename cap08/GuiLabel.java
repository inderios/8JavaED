package cap08;
import java.awt.*;
import javax.swing.*;
public class GuiLabel extends JPanel {//extends aplica herança a minha classe, herança de JPanel? Herda os métodos alguns ou todos
    private JLabel label1, label2, label3, label4;//declaração dos objetos da Classe JLabel que que armazenarão texto e imagens
    private ImageIcon imageIcon1;

    public GuiLabel() {
        inicializarComponentes();
    }// método construtor da classe GuiLabel, apenas a inicialização dos componentes é necessário nesse exemplo

    private void inicializarComponentes() {
        setLayout(new GridLayout(4, 1));//seta o layout para uma grade com 4 linhas horizontais, rows, e apenas uma coluna, cols.
        imageIcon1 = new ImageIcon("C:/Users/frace/OneDrive/Documentos/GitHub 8JavaE/DispensaDeTesteDeDados/icons8-logo-java-coffee-cup-40.png");
        setBackground(new Color(100, 220, 100));//cor de fundo, usa o padrão RGB para fazer a cor, é verde!
        label1 = new JLabel("   Aprendendo", JLabel.LEFT);//inicializa o componente dá um texto, e localização, por padrão já é esquerdo, então isso é meio redundante
        label1.setForeground(Color.white);//vamos ler, para o objeto, label1, utilize a cor para a fonte, setForeground, para branco, Color.WHITE.
        label2 = new JLabel(imageIcon1);//inicialização de um label apenas com uma imagem.
        label3 = new JLabel("Inserir   ", JLabel.RIGHT);//na grade Right = 0, na posição, center = 1, right = 2;
        label3.setForeground(Color.blue);
        label4 = new JLabel("Labels e Imagens", imageIcon1, JLabel.CENTER);//inicialização de um label com texto e imagem.
        label4.setFont(new Font("Serif", Font.BOLD, 20));//formata o texto para para utilizar a fonte Serif em negrito.
        label4.setForeground(Color.BLACK);
        add(label3);
        add(label1);
        add(label2);
        add(label4);//como só existem uma coluna é tudo colocado em sequência, 
        //a ordem que é coloado é importante, se caso fose duas colunas deveria ser 
        //espeficado a ordem, linhaX_colunaY, o preenchimento acontece de cima para baixo,
        // da esquerda para direita.
    }
}
