package org.example;

public class Moto extends Veiculo {
    public Moto(String placa, int anoFabricacao, String combiustivel) {
        super(placa, anoFabricacao, combiustivel);
    }

    Veiculo moto = new Veiculo("ANA012", 2019, "gasolina") {
    };
}

