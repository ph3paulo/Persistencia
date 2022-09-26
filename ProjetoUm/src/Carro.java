/* 1. Defina uma entidade principal com pelo menos 5 atributos e relacionada a um domínio de problema.
Crie também uma classe Java para representá-la. Exemplo de entidade com 9 atributos: Cliente: id, nome,
cpf, endereço, email, fone, cidade, uf, cep.
A entidade deve estar relacionada a algo que você gosta bastante como: hobie, esporte, pet, alimentação,
educação, música, filmes, séries, redes sociais, etc.
A entidade escolhida por você não pode ser a entidade Cliente dada como exemplo.
Escolha uma entidade bem diferente dela, inclusive quanto aos seus atributos. */

public class Carro {
    String modelo;
    String placa;
    int qtdPortas;
    int velocidade;
    int qtdCombustivel;

    public Carro(){
    }
    
    public Carro(String modelo, String placa, int qtdPortas, int velocidade, int qtdCombustivel) {
        this.modelo = modelo;
        this.placa = placa;
        this.qtdPortas = qtdPortas;
        this.velocidade = velocidade;
        this.qtdCombustivel = qtdCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(int qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    @Override
    public String toString() {
        return "listaDeCarros{" +
        "Modelo='" + modelo + '\'' +
        ", placa='" + placa + '\'' +
        ", quantidadePortas='" + qtdPortas + '\'' +
        ", Velocidade='" + velocidade + '\'' +
        ", CapacidadeCombustivel='" + qtdCombustivel + '\'' +
        '}';
    }
}
