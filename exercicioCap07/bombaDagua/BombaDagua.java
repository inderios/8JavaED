package exercicioCap07.bombaDagua;
public class BombaDagua {
    private boolean status;
    public void ligar(int tempoSegundos) {
        if (tempoSegundos < 0) {
            throw new IllegalArgumentException("O tempo em segundos deve ser positivo!");
        }
        this.status = true;
        try {
            long inicio = System.currentTimeMillis();
            for (int i = 0; i < tempoSegundos; tempoSegundos--) {
                Thread.sleep(tempoSegundos*1000);
                System.out.println("Segundos Restantes: " + tempoSegundos);
            }
            long fim = System.currentTimeMillis();
            System.out.println(fim - inicio);
        } catch (Exception e) {
            System.out.println("Houve uma pausa inesperada \n" + e.toString());
    
        } finally {
            this.desligar();
        }
    }
    public void desligar() {
        this.status = false;
    }
}
/*
 * Faça uma classe que simule o funcionamento de uma bomba d'água. A bomba possui um atributo
 * booleano chamado "status" e os métodos "ligar" e desligar (ambos sem retorno). O método "ligar"
 * coloca true em "status" e o método "desligar" coloca false em status. A bomba deve ficar ligada durante
 * um certo intervalo de tempo (em segundos). O tempo em segundos deve ser recebido pelo método ligar. A cada segundo, apresente
 * em tela quantos segundos falta para a bomba ser desligada. Decorrido o tempo, o método desligar é acionado e a bomba é desligada.
 */