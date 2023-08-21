package Atv13;

public class TesteVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla GLI 2.0 Dynamic Force (Flex) ", 2023, 4, "131.522");
        Moto moto = new Moto("Honda", "CBR500R", 2023, 500, "7.500");

        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();
        System.out.println();

        System.out.println("Detalhes da Moto:");
        moto.exibirDetalhes();
    }
}

