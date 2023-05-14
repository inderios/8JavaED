package cap07.produto;

public class UsaProduto {
    public static void main(String[] args) {
        //teste gravação
        ProdutoPersiste produto = new ProdutoPersiste();
        produto.setCodigo(22);
        produto.setDescricao("Escova de dentes");
        System.out.println(produto.gravar());
        //teste de leitura
        Produto p = ProdutoPersiste.ler(22);
        System.out.println(p.getCodigo());
        System.out.println(p.getDescricao());
    }
}
