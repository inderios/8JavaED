package cap07.Televisor02;
public class TelevisorEncapsulada {
    private int volume;
    private int canal;

    public TelevisorEncapsulada() {

    }
    public TelevisorEncapsulada(int volume) {
        this.volume = volume;
    }
    public TelevisorEncapsulada(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }
    public void aumentarCanal() {
        if (canal < 1000) {
            canal++;
        }
    }
    public void reduzirCanal() {
        if (canal > 0) {
            canal--;
        }
    }
    public void mostrar() {
        System.out.println("Volume: " + getVolume() + "\nCanal: " + getCanal());
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        try {
            if (volume >= 0 && volume <=100) {
                this.volume = volume;
            } else {
                throw new Exception ("Volume fora da faixa permitida, deve ser um valor entre 0 e 100.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        if (canal >= 0 && canal <= 1000){
            this.canal = canal;
        }
    }
    
}
