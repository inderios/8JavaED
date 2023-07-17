package cap08;
import java.awt.*;
import javax.swing.JInternalFrame;//importação da classe que será usada nesse exemplo
public class GuiFrameInterno extends JInternalFrame{//extendo por meio da herança o JinternalFrame.

    public GuiFrameInterno() {
        inicializarComponente();
    }

    private void inicializarComponente() {
        setTitle("Usando Frame Interno");
        setSize(300, 100);//definindo o tamanho do frame interno atraves do size.
        setResizable(true);//torna possivel a redimensionar
        setClosable(true);//é possivel fechar o frame;
        setMaximizable(true);//é possivel maximizar,boolean
        setIconifiable(true);//possivel minizar a o frame.
        setBackground(Color.ORANGE);//cor de fundo laranja.
        setVisible(true);
    }
}
