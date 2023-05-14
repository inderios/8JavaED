package cap07.Televisor02;

public class TelevisorTestaConstrutor {
    public static void main(String[] args) {
        TelevisorEncapsulada tv1 = new TelevisorEncapsulada();
        TelevisorEncapsulada tv2 = new TelevisorEncapsulada(150);
        TelevisorEncapsulada tv3 = new TelevisorEncapsulada(150, 3);

        tv1.mostrar();
        tv2.mostrar();
        tv3.mostrar();
    }
    
}
