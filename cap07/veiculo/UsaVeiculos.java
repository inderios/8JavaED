public class UsaVeiculos {
    public static void main(String[] args) {
        //Veiculo veiculo = new Veiculo(); --> essa linah gera erro
        Automovel automovel = new Automovel();
        automovel.ligar();
        automovel.acelerar();
        System.out.println(automovel.velocidade);
        automovel.desligar();

        Aviao aviao = new Aviao();
        aviao.ligar();
        aviao.acelerar();
        System.out.println(aviao.velocidade);
        aviao.desligar();
    }
}
