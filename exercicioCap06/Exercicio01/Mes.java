package exercicioCap06.Exercicio01;

public class Mes {
    /**
     * @param numeroMes
     * @param idioma
     * @return
     */
    /**
     * O retorno é uma string com o nome do mês.
     * O método usar o caso de swtich-case para procurar de maneira rapida o més corresponde, correspondente ao idioma que usar, os meses são 12 que corresponde aos 12 meses do ano, cada case está associado a més.
     * if else, pois são apenas duas opções por isso deixei assim, e caso o número do idioma seja invalido, não reconhece devolvendo 
     * idioma inválido.
     * @param numeroMes
     * @param idioma
     * @return
     */
    public static String getMesPorExtenso(int numeroMes, int idioma) {
        String mes = "";
        if(idioma == 1){
            switch(numeroMes) {
                case 1:
                    mes = "Janeiro";
                    break;
                case 2:
                    mes = "Fevereiro";
                    break;    
                case 3:
                    mes = "Março";
                    break;
                case 4:
                    mes = "Abril";
                    break;      
                case 5:
                    mes = "Maio";
                    break;     
                case 6:
                    mes = "Junho";
                    break;
                case 7:
                    mes = "Julho";
                    break;
                case 8:
                    mes = "Agosto";
                    break;
                case 9:
                    mes = "Setembro";
                    break;
                case 10:
                    mes = "Outubro";
                    break;
                case 11:
                    mes = "Novembro";
                    break;
                case 12:
                    mes = "Dezembro";
                    break;        
            }
        }else if (idioma == 2) {
            switch(numeroMes) {
                case 1:
                    mes = "January";
                    break;
                case 2:
                    mes = "February";
                    break;    
                case 3:
                    mes = "March";
                    break;
                case 4:
                    mes = "April";
                    break;      
                case 5:
                    mes = "May";
                    break;     
                case 6:
                    mes = "June";
                    break;
                case 7:
                    mes = "July";
                    break;
                case 8:
                    mes = "August";
                    break;
                case 9:
                    mes = "September";
                    break;
                case 10:
                    mes = "October";
                    break;
                case 11:
                    mes = "November";
                    break;
                case 12:
                    mes = "Dezember";
                    break;
            }
        }else {
            return "Idioma inválido";
        }    
    return mes;
    }
}
/**
 * Faça uma classe chamada mes que posssua um metodo chamado getMesPorExtenso que recebe
 * um número inteiro, referente ao mês do ano, um código referente ao idioma (1 para portugues e 2 para inglês)
 * e retorne o mês por extenso. A tabela a seguir ilustra alguns exemplos.
 * Faça uma outra classe para testar o método.
 */