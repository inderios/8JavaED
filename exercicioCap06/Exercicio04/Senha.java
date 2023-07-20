package exercicioCap06.Exercicio04;

public class Senha {
    public static String gerar() {
        int limite = 10;
        StringBuilder senha = new StringBuilder();
        int quantCaracteres = 8;
        for (int i = 0; i < quantCaracteres; i++) {
            senha.append(String.valueOf((int) (Math.random() * limite)));
        }
        return senha.toString();    
    }
    /*private static final String DIGITOS = "0123456789";
    private static final int TAMANHO_SENHA = 8;

    public static String gerar2() {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(TAMANHO_SENHA);
        for (int i = 0; i < TAMANHO_SENHA; i++) {
            int indice = random.nextInt(DIGITOS.length());
            senha.append(DIGITOS.charAt(indice));
        }
        return senha.toString();
    }*/
}
/**
 * Crie uma classe chamada Senha que contenha um método chamado gerar que retorna uma senha
 * dontendo oito caracteres numericos. Faça também uma classe para testar o método.
 */