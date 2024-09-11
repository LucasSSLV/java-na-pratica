package org.example;

public class Carro extends Veiculo {

    public Carro(String placa, int anoFabricacao, String combiustivel) {
        super(placa, anoFabricacao, combiustivel);
    }

    @Override
    public void getAbastecimentos() {
        System.out.println(abastecimentos);
    }

    @Override
    public void getFullInfos() {
        System.out.println("placa: " + placa + "\nano de fabricação: " + anoFabricacao + "\ntipo de combustível: " + combustivel);
    }
}
