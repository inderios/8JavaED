package cap07.Televisor;
public class Televiso {
    public int volume;
    public int canal;
    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {

    }
    public void trocarCanal (int c) {
        canal = c;
    }
    public void mostrar() {
        System.out.println("Volume: " + volume + "\nCanal: " + canal);
    }
}
