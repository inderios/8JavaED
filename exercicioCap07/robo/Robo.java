package exercicioCap07.robo;

public class Robo implements Controle{

    @Override
    public void andar() {
        System.out.println("O robor anda um quadrado!");
    }

    @Override
    public void virar() {
        System.out.println("O robor vira para trás!");
    }

    @Override
    public void falar() {
        System.out.println("Bit boop, bit, bit, boop!");
    }
}
