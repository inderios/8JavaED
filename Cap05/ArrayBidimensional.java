package Cap05;
public class ArrayBidimensional {
    public static void main(String[] args) {
        int [] [] matrix = new int[3] [3];
        matrix [0] [0] = 120; matrix [1] [0] = 232; matrix [2] [0] = 201;
        matrix [0] [1] = 129; matrix [1] [1] = 111; matrix [2] [1] = 197;
        matrix [0] [2] = 128; matrix [1] [2] = 247; matrix [2] [2] = 123;
        for(int linha = 0; linha < matrix.length; linha++) {
            for (int coluna = 0; coluna < matrix[linha].length; coluna++) {
                System.out.println("(" + linha + ","+ coluna + ")" + matrix[linha] [coluna]);
            }
        }
    }
}
