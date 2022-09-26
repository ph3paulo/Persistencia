/* 4. Crie uma classe Java que recebe como entrada de teclado o nome de um arquivo qualquer e o compacta para o formato ZIP
ou outro formato de compressão à sua escolha. */

import java.io.File;
import java.nio.file.Files;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Compactador {
    public static void main(String[] args) throws Exception {
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite o nome do Arquivo:");
        String arquivo = imput.nextLine();

        File file = new File(arquivo);

        String nome = file.getName().concat(".zip");
        FileOutputStream os = new FileOutputStream(nome);
        ZipOutputStream zos = new ZipOutputStream(os);
        zos.putNextEntry(new ZipEntry(arquivo));
        byte[] bytes = Files.readAllBytes(Paths.get(arquivo));
        zos.write(bytes,0,bytes.length);
        zos.closeEntry();
        zos.close();
        imput.close();
    }
}
