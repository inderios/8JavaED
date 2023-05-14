package cap07.Televisor;

public class UsarTelevisor {
    public static void main(String[] Args) {
        Televiso tv = new Televiso();
        tv.canal = 150;
        tv.volume = 3;
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.trocarCanal(10);
        tv.mostrar();
    }
}
