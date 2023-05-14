package cap03;
public class Relogio {
    public static void main(String args[]) throws InterruptedException {
        int horas, minutos, segundos;
        for (horas = 0; horas < 24; horas++) { //quando minutos chega a 59 termina um laço e add uma hora
            for (minutos = 0; minutos < 60; minutos++ ) {
                for (segundos = 0; segundos < 60; segundos++ ) {// quando segundos chegar a 59 termina o laço e add 1 a minutos
                    System.out.println(horas + "h: " + minutos + "min: " + segundos + "s");
                    try {
                        Thread.sleep(1000) ;//espera mil milisegundo a até a execução da proxima linha, não recomendado em aplicação a vida real
                        if (segundos == 59) {// esse codigo termina quando segundos chega a 59, chamdno system.exit
                            System.exit(0) ;
                        }
                    } catch (InterruptedException erro) {
                        erro.toString();
                    }
                }
            }
        }
        System.exit(0);
    }
}
