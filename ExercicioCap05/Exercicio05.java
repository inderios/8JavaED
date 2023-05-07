package ExercicioCap05;

import javax.swing.*;

public class Exercicio05 {
    private static final int TOTAL_DE_VAGAS = 10;
    private static String[] vagas;
    public Exercicio05() {
        this.vagas = new String[TOTAL_DE_VAGAS];
    }
    public static void main(String[] args) {
        Exercicio05 exercicio = new Exercicio05();
        boolean continuar = true;
        while (continuar) {
            String[] opcoes = {"ENTRADA", "SAÍDA", "STATUS", "SAIR"};
            try {
                int acao = JOptionPane.showOptionDialog(null, "Escolha uma ação: ", "GARAGEM",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
                switch (acao) {
                    case 0:
                        int vagaIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite " +
                                "a vaga a ser ocupada logo abaixo: "));
                        String placa = JOptionPane.showInputDialog(null, "Digite a placa: ");
                        JOptionPane.showMessageDialog(null, exercicio.entradaVeiculos(vagaIndex, placa));
                        break;
                    case 1:
                        int indexVagaLiberada = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Digite o número da vaga que acabou de ser liberada"));
                        JOptionPane.showMessageDialog(null, exercicio.saidaVeiculo(indexVagaLiberada));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, exercicio.status());
                        break;
                    case 3:
                        continuar = false;
                        break;

                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Por favor ensira uma opção válida");
            }
        }
    }
    public  String entradaVeiculos(int vagaIndex, String placa) {
        String mensagem = "";
        if (vagas[vagaIndex] == null || vagas[vagaIndex].isEmpty()) {
            vagas[vagaIndex] = placa;
            mensagem = "Carro da placa '" + placa + "' estacionado na vaga '" + vagaIndex + "' com sucesso.";
        }else {
            mensagem = "Vaga " + vagaIndex + " já está ocupada.";
        }
        return mensagem;
    }
    public  String saidaVeiculo(int vagaLiberada) {
        String mensagem = "Vaga inexistente";
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] != null && i == vagaLiberada) {
                vagas[i] = null;
                mensagem = "Vaga liberada com sucesso.";
                break;
            }else {
                mensagem = "Vaga já está liberada";
            }
        }
        return mensagem;
    }
    public  String status() {
        String mensagem = "";
        for(int i = 0; i < vagas.length; i++) {
            if(vagas[i] != null) {
                mensagem += "//Vaga '" + i + "' está ocupada,\n pelo carro com a placa: '" + vagas[i] + "'.//\n";
            } else {
                mensagem += "//Vaga '" + i + "' está livre.//\n";
            }
        }
        return mensagem;
    }
}
/*
Usando um array unidimensional de 10 elementos do tipo string, faça uma classe que simule a ocupação de um estacionamento, de veículos.
Considere que a posição do array corresponde ao número da vaga e para cada vaga é armazenada a placa do veículo que está estacionado.
Sua classe deve conter um laço de repetição simulando um menu que controle a entrada e a saida dos veículos, com as opções:
 1 - Entrada, 2 -Saida e 3 Listar situação atual 4 - Encerrar o programa.
 Se o usuario escoler 1, solicite o número da vaga e a placa do veículo;
  se escolher 2, solicite o número da vaga que sera liberada e armazene o valor branco na posição correspondete ao array;
  se escolher 3, liste a situação atual apresentando em tela todos os elementos do array;
  quando for 4, encerre o laço e o programa.
*/