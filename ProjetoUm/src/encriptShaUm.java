import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class encriptShaUm {
    public static void main(String[] args) throws Exception {
        String arquivo,hexa;
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo: ");
        arquivo = imput.nextLine();

        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(arquivo.getBytes(),0,arquivo.length());
        byte[] digest = md.digest();
        
        hexa = new BigInteger(1,digest).toString(16);
        System.out.println("A HASH SHA-1 do arquivo é : "+hexa);

        imput.close();
    }
}
