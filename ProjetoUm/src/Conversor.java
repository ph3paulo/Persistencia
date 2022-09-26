/* 3. Crie uma classe Java que recebe via linha de comando o nome de um arquivo qualquer em formato JSON e o converte para os formatos CSV e XML. */

import java.io.File;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class Conversor {
    public static void main(String[] args) throws Exception, CsvDataTypeMismatchException,CsvRequiredFieldEmptyException{
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo .Json");
        File arq = new File(imput.nextLine());

        ObjectMapper omgood = new ObjectMapper();
        ArrayCarros listaCarros = omgood.readValue(arq, ArrayCarros.class);

        File arqxml = new File("carroConvertido.xml");
        XmlMapper xm = new XmlMapper();
        xm.enable(SerializationFeature.INDENT_OUTPUT);
        xm.writeValue(arqxml, listaCarros);

        Writer nomequalquer = Files.newBufferedWriter(Paths.get("CarroConvertitdo.csv"));
        StatefulBeanToCsv<ArrayCarros> bean = new StatefulBeanToCsvBuilder<ArrayCarros>(nomequalquer).build();

        bean.write(listaCarros);
        nomequalquer.flush();
        nomequalquer.close();
        imput.close();
    }
}
