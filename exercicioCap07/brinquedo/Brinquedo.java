package exercicioCap07.brinquedo;

public class Brinquedo {
    private String nome;
    private String faixaEtaria;
    private float preco;
    public Brinquedo () {   
    }
    public Brinquedo (String nome) {
        this.nome = nome;
    }
    public Brinquedo(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void mostrar () {
        System.out.println("Nome: " + nome + "\nPreço: " + preco + "\nFaixa Étaria: " + faixaEtaria);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFaixaEtaria() {
        return faixaEtaria;
    }
    public void setFaixaEtaria(String faixaEtaria) {
        try {
            String regex = "^([0-9]\s*a\s*([1-9]|10))|[1-9][0-9]$";
            if((faixaEtaria.toLowerCase().matches(regex))) {
                this.faixaEtaria = faixaEtaria;
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor digite corretamente, ex: [0-9] a [1-10] ou um número no máximo 99: \n" + e.toString());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.toString());
        }
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
/*Considere a representação da classe Brinquedo da Figura 7.12. Elabore essa classe em java contendo os métodos
 * get e set necessáris e os métodos construtores apresentados. O atributo faixaEtaria é um atributo do tipo String
 * que deve receber apenas um dos valores seguintes: "0 a 2", "3 a 5", "6 a 10", e "acima de 10". Outros valores são inválidos
 * e não devem ser armazenados. Essa validação deve ser realizada no método setFaixaEtaria. A seguir, elabore a classe
 * UsaBrinquendo para testar as funcionalidades da classe brinquedo.
 */