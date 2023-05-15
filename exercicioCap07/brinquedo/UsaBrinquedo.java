package exercicioCap07.brinquedo;

public class UsaBrinquedo {
    public static void main(String[] args) {
        Brinquedo carro = new Brinquedo();
        Brinquedo vaca = new Brinquedo("vaca");
        Brinquedo playstation = new Brinquedo("PS2", 500);
        carro.setNome("Mama Mia");
        carro.setPreco(20);
        carro.setFaixaEtaria("2 a 5");
        carro.mostrar();
        vaca.setPreco(2.60F);//esqueci tinha que colocar o f no final pra indicar que é um float
        vaca.setFaixaEtaria("10");
        vaca.mostrar();
        playstation.setFaixaEtaria("12");
        playstation.mostrar();
    }
    
}
