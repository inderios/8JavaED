package cap07.produto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProdutoPersiste extends Produto{
    public String gravar() {
        String ret = "Produto armazenado com sucesso!";
        try {
            FileOutputStream file = new FileOutputStream("C:/Users/frace/OneDrive/Documentos/GitHub 8JavaE/DispensaDeTesteDeDados/Produto" + this.getCodigo());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();
            stream.close();     
        } catch (Exception e) {
            ret = "Falha na gravação\n" + e.toString();
        }
        return ret;
    }
    public static Produto ler(int codigo) {
        try {
            FileInputStream file = new FileInputStream("C:/Users/frace/OneDrive/Documentos/GitHub 8JavaE/DispensaDeTesteDeDados/Produto" + codigo);
            try (ObjectInputStream stream = new ObjectInputStream(file)) {
                return((Produto) stream.readObject());
            }
        } catch (Exception e) {
            System.out.println("Falha na leitura\n " + e.toString() );
            return null;
        }
    }
}
