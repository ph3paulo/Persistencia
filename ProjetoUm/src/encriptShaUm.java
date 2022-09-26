/* 5. Crie uma classe Java que recebe via linha de comando o nome de um arquivo qualquer e exibe no console o hash SHA1 desse arquivo.
 Dica: você pode se basear no exemplo a seguir, que gera o hash md5 e adaptá-lo para gerar o hash SHA1: https://www.baeldung.com/java-md5  */

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class encriptShaUm {
    public static void main(String[] args) throws Exception {
        String arq, shaUm;
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite o nome do arq: ");
        arq = imput.nextLine();

        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(arq.getBytes(),0,arq.length());
        byte[] digest = md.digest();
        
        shaUm = new BigInteger(1,digest).toString(16);
        System.out.println("SHA - 1: " + shaUm);

        imput.close();
    }
}
