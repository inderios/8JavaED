package cap07.pessoa;

public class PessoaFisica extends Pessoa{
    private String rg;
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public void mostraClasse() {
        System.out.println("Classe Pessoa Fisica");
    }
}
