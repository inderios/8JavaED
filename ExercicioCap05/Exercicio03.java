package exercicioCap05;

import java.util.Arrays;

public class Exercicio03 {
    public static void main(String[] args) {
        int[] [] tela = new int [40] [40];
        int valorMaximo = 256;
        int[] tonalidades = new int[1600];
        for(int linha = 0; linha < tela.length; linha++){
            for (int coluna = 0;  coluna < tela[linha].length; coluna++) {
                int tonalidade = (int) (Math.random() * valorMaximo);
                tela[linha][coluna] = tonalidade;
                tonalidades[linha * tela.length + coluna] = tonalidade;
            }
        }
        System.out.println(Arrays.toString(tonalidades));
    }
}
/*
Uma imagem é formada por pixels. Considere uma imagem com dimensão 40 x 40 e faça uma classe que contenha um array
bidimensional com essas dimensões. A seguir, para cada posição desse array bidimensional com essas dimensões.
A seguir, para cada posição desse array bidimensional armazene um valor aleatório  entre 0 e 255 (esses valores
correspondem às tonalidades aplicadas sobre a imagem). Apresente em tela os 1600 valores gerados.
*/