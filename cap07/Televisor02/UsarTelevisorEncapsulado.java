package cap07.Televisor02;

public class UsarTelevisorEncapsulado {
    public static void main(String[] args) {
        TelevisorEncapsulada tv = new TelevisorEncapsulada();
        tv.setCanal(150);
        tv.aumentarCanal();
        tv.setVolume(3);
        tv.diminuirVolume();
        System.out.println(tv.getCanal());
        System.out.println(tv.getVolume());
    }
    
}
