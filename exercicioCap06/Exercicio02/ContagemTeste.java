package exercicioCap06.Exercicio02;

public class ContagemTeste {
    public static void main(String[] args) throws InterruptedException {
        Contagem.contar();
        Contagem.contar(20);
        Contagem.contar(50, 100);
        Contagem.contar(1, 10, 1);
    }
    
}
