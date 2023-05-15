package exercicioCap07.testeGPS;

public class UsaGPS {
    public static void main(String[] args) {
        GPS gps = new GPS();
        gps.setIdioma("inglês");
        gps.setRota("RioDeJaneiro");
        gps.mostrar();

        GPS gps2 = new GPS("Pernambuco");
        gps2.mostrar();
    }
}
