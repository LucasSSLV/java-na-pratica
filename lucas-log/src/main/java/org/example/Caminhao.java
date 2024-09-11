package org.example;

public class Caminhao extends Veiculo implements Transportador {

    public Caminhao(String placa, int anoFabricacao, String combiustivel) {
        super(placa, anoFabricacao, combiustivel);
    }

    @Override
    public void transportar() {
        System.out.println("leva muita carga.");
    }
}
