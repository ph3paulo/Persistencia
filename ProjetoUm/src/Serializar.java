/* 2. Crie uma classe Java para cadastrar dados relacionados à entidade definida na questão 1.
A classe deve receber dados via teclado e os salvar em um arquivo JSON. */

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Serializar {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        String modelo, placa;
        int qtdPortas, velocidade, qtdCombustivel;
        
        System.out.println("Modelo:");
        modelo = input.nextLine();
        System.out.println("Placa:");
        placa = input.nextLine();
        System.out.println("Portas:");
        qtdPortas = input.nextInt();
        System.out.println("Velocidade:");
        velocidade = input.nextInt();
        System.out.println("Combustivel:");
        qtdCombustivel = input.nextInt();

        Carro automovel = new Carro(modelo, placa, qtdPortas, velocidade, qtdCombustivel);

        List<Carro> carros = new ArrayList<Carro>();
        carros.add(automovel);

        ArrayCarros listaCarros = new ArrayCarros(carros);
        ObjectMapper objmCarros = new ObjectMapper();

        objmCarros.enable(SerializationFeature.INDENT_OUTPUT);
        objmCarros.writeValue(new File(modelo + ".json"), listaCarros);

        input.close();
    }
}
