package exercicioCap07.testeGPS;

public class GPS {
    private String idioma;
    private String rota;
    public GPS() {
    }
    public GPS(String rota) {
        this.idioma = "português";
        this.rota = rota;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public void setRota(String rota) {
        this.rota = rota;
    }
    public void mostrar() {
        System.out.println("Idioma: " + idioma +"\nRota: " + rota); 
    }
}
/*Crie uma classe chamada GPS contendo os seguintes atributos do tipo String: "idioma" e "rota".
 * Defina dois métodos construtores: o default e outro para ligar o GPS com o idioma português e uma rota qualquer.
 * Elabole métodos para realizar as seguintes funções:
 * Definir idioma;
 * Definir rota;
 * Um método chamado "mostrar" para apresentar todos os valores atuais dos atributos do GPS.
 * Elabore também uma outra classe (UsaGPS) para testar essas funcionalidades.
 */