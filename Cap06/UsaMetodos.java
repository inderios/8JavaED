package cap06;

public class UsaMetodos {
    public static void main(String[] args) {
        MetodosSemRetorno.imprimirTexto("Usando método de outra classe");
        MetodosSemRetorno.somar(20, 30);
        System.out.println(MetodosComRetorno.mostrarDiasPorExtenso(5));
        System.out.println(MetodosComRetorno.contarLetrasA("Macacada"));
    }
}
