package exercicioCap05;
public class Exercicio02 {
    public static void main(String[] args) {
        String[] meses = {"Janeiro", "Fevereiro","Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"};
        int mes = (int)(Math.random() * meses.length);
        System.out.println(meses[mes]);

    }
}
/*
Crie uma classe que armazene os 12 meses do ano em um array, a seguir, gere um valor randômico entre 0 e 11 e apresene
o mês correspondente ao valor sorteado. COnsidere que o valor 0 corresponde ao mês de janeiro e o valor 11 ao mês de dezembro.t
*/