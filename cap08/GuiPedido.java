package cap08;
import javax.swing.*;
import javax.swing.table.*;//importe das diversas classes do tópico desse programa
import javax.swing.border.TitledBorder;//importa adiciona uma borda com titulo na table;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;//java.text serve para formata numeros com casa decimais.
public class GuiPedido extends JPanel{
    private JPanel pnPrincipal, pnTable;
    private JButton btRemover, btAdicionar;
    private JScrollPane scrollTable;
    private JTable table;
    private JLabel lbNumero, lbTotal, lbProduto, lbPrecoUnitario, lbQuantidade;
    private JTextField tfNumero, tfTotal, tfProduto, tfPrecoUnitario, tfQuantidade;//todos os componentes necessários para efetuação desse programa.
    DecimalFormat df = new DecimalFormat("#,###.00");//formatação do valor monetário.
    
    public GuiPedido() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        setBackground(Color.ORANGE);
        lbProduto = new JLabel("Produto");
        lbQuantidade = new JLabel("Quantidade");
        lbPrecoUnitario = new JLabel("Preco Unitário");
        lbNumero = new JLabel("Numero do pedido: ");
        lbTotal = new JLabel("Total do Pedido: ");
        tfProduto = new JTextField();
        tfPrecoUnitario = new JTextField(); 
        tfQuantidade = new JTextField(); 
        tfNumero = new JTextField(); 
        tfTotal = new JTextField(); 
        tfTotal.setEnabled(false);//para o usuario não poder editar o tamanho da caixa
        tfTotal.setHorizontalAlignment(JTextField.RIGHT);//Alinhanmento da caixa a direita.
        btAdicionar = new JButton("Adicionar");
        btAdicionar.setToolTipText("Adicionar um item ao pedido");
        btRemover = new JButton("Remover");
        btRemover.setToolTipText("Remove os itens selecionados");

        //labels
        lbNumero.setBounds(15, 10, 120, 25);
        lbPrecoUnitario.setBounds(310, 40, 100, 25);
        lbProduto.setBounds(15, 40, 100, 25);
        lbQuantidade.setBounds(225, 40, 100, 25);
        lbTotal.setBounds(200, 360, 100, 25);
        //textField
        tfNumero.setBounds(130, 10, 50, 25);
        tfPrecoUnitario.setBounds(310, 65, 80, 25);
        tfProduto.setBounds(15, 65, 200, 25);
        tfQuantidade.setBounds(225, 65, 50, 25);
        tfTotal.setBounds(300, 360, 100, 25);
        //botões
        btAdicionar.setBounds(15, 100, 100, 22);
        btRemover.setBounds(125, 100, 100, 22);

        pnPrincipal = new JPanel();
        pnPrincipal.setLayout(null);
        pnPrincipal.setBounds(0, 0, 500, 400);
        pnPrincipal.add(lbNumero);
        pnPrincipal.add(lbTotal);
        pnPrincipal.add(tfNumero);
        pnPrincipal.add(tfTotal);
        pnPrincipal.add(lbProduto);
        pnPrincipal.add(tfProduto);
        pnPrincipal.add(lbQuantidade);
        pnPrincipal.add(tfQuantidade);
        pnPrincipal.add(lbPrecoUnitario);
        pnPrincipal.add(tfPrecoUnitario);
        pnTable = new JPanel(new BorderLayout());//cria um painel pnTable com o gerenciador de borderLayout.
        pnTable.setBorder(new TitledBorder("Itens do Pedido"));//borda com titulo.
        scrollTable = new JScrollPane();
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        pnPrincipal.add(btAdicionar);
        pnPrincipal.add(btRemover);
        DefaultTableModel tableModel = new DefaultTableModel(//criação do table model.
            new String[] {"Produto", "QTde", "Preço Un.", "Total"}, 0) {//nomes da colunas, que serão usadas, o zero indica que a tabela inicialmente não tera nenhuma linha.
            public boolean isCellEditable(int row, int col) {//redefine a classe is Editable, o objetio e dizer quais celulas setão editadas pelo usuario e quais não serão
                if (col == 3) {//a coluna trés não sera editavel pelo o usuario
                    return false;
                }
                return true;
                }
            };
        table = new JTable(tableModel);//cria o objeto table a parti das caracteriscas do tableModel.
        DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();//usando a classe aqui mostrada serve para colocar as células uma perto da outra.
        alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);//indica o alinhamento normal usando a constante Right.
        table.getColumnModel().getColumn(0).setPreferredWidth(150);//aqui
        table.getColumnModel().getColumn(0).setResizable(false);//aqui2
        table.getColumnModel().getColumn(1).setPreferredWidth(50);//aqui
        table.getColumnModel().getColumn(1).setResizable(false);//aqui2
        table.getColumnModel().getColumn(1).setCellRenderer(alinhaDireita);//aqui3
        table.getColumnModel().getColumn(2).setPreferredWidth(100);//aqui
        table.getColumnModel().getColumn(2).setResizable(false);//aqui2
        table.getColumnModel().getColumn(2).setCellRenderer(alinhaDireita);//aqui3
        table.getColumnModel().getColumn(3).setPreferredWidth(100);//aqui, definem a largura de cada coluna, como interpretar, pega todas as colunas, depois uma especificada e depois define a largura preferrida
        table.getColumnModel().getColumn(3).setResizable(false);//aqui2,bascicamente está proibido fazer redimensionamento das colunas
        table.getColumnModel().getColumn(3).setCellRenderer(alinhaDireita);//aqui3, apenas indica que o direcinamento da das celulas sera para direita.
        table.getTableHeader().setReorderingAllowed(false);//não sera permitido a reorfanização, como agarrar e soltar.
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//apenas indica que não sera redimensionada caso as letras passem o tamanho da célula.
        table.setBackground(Color.yellow);
        scrollTable.setViewportView(table);//define o objeto table como conteudo de scrolltable por meio do metodo setViewportView, o painel de rolagem entra em sincronização com o objeto table.
        scrollTable.setBackground(Color.YELLOW);
        pnTable.add(scrollTable);//adiciona o scrolltable ao painel
        pnTable.setBounds(10, 130, 413, 230);
        pnPrincipal.add(pnTable);
        //pnPrincipal.add(pnTable);//adiciona pntable ao painel principal.
        add(pnPrincipal);
    }

    private void definirEventos() {
        btAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tfProduto.getText().equals("") || tfQuantidade.getText().equals("") || 
                tfPrecoUnitario.getText().equals("")) {//vericam se tem algum valor dentro delas, se uma não tiver valor se torn true
                    JOptionPane.showMessageDialog(pnTable, "Preencha todos os campos!");
                    return;
                }
                DefaultTableModel dtm = (DefaultTableModel) table.getModel();//ira carregar todo ocotneudo da tabela.
                dtm.addRow(new Object[]{tfProduto.getText(), tfQuantidade.getText(), 
                    tfPrecoUnitario.getText(), "" + df.format(Integer.parseInt(
                        tfQuantidade.getText()) * Double.parseDouble(tfPrecoUnitario.getText()))});//adicionam uma nova linha na tabela.
                limparCampos();//limpar a caixa de texto aos itens pedidos.
                calcularTotal();//calcula o total pedido considerando o item pedido.
            }
        });
        btRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[] linhas = table.getSelectedRows();//todas as linhas selecionadas serão colocadas aqui
                DefaultTableModel dtm = (DefaultTableModel) table.getModel();//mesmo que a linha 112.
                for (int i = (linhas.length - 1); i >= 0; i--) {
                    dtm.removeRow(linhas[i]);
                }//percorre todas as linhas e remove as linhas selecionadas em linhas[].
                calcularTotal();//depois calcula o total.
            }
        });
    }

    private void calcularTotal() {
        double total = 0;
        for (int linha = 0; linha < table.getRowCount(); linha++) {//realiza a leitura de todas a linhas que aparecem na grade.
            String valor = "" + table.getValueAt(linha, 3);//pega a linha que é parte do loop, é a coluna 3 onde está armazenado o valor total.
            valor = valor.replace(".", "");//remove o ponto para poder realizar o calculo.
            valor = valor.replace(",", ".");//realiza a troca da virgula pelo ponto para fazer calculo de decimais, para realizar a conta.
            total += Double.parseDouble(valor);//acumula no valor total.
        }
        tfTotal.setText("" + df.format(total));//na caixa apresenta o valor total 
    }

    private void limparCampos() {
        tfProduto.setText("");
        tfQuantidade.setText("1");//valor comum do produto.
        tfPrecoUnitario.setText("");
        tfProduto.requestFocus();//coloca o bagulho que pisca e faz digitação dentro dessa caixa.
    }
}
