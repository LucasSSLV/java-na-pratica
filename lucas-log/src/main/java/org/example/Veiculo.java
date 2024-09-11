package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {
    private String placa;
    private int anoFabricacao;
    private String combiustivel;
    private List<String> abastecimentos;


    public Veiculo(String placa, int anoFabricacao, String combiustivel) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.combiustivel = combiustivel;
    }

    public void Abastecer() {
        this.abastecimentos = new ArrayList<>();
    }

    public void AdicionaAbastecimento(String local, String motorista, double valor) {
        String abastecimento = "Local: " + local + ", Motorista: " + motorista + ", Valor: " + valor;
        abastecimentos.add(abastecimento);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCombiustivel() {
        return combiustivel;
    }

    public void setCombiustivel(String combiustivel) {
        this.combiustivel = combiustivel;
    }

    public List<String> getAbastecimentos() {
        return abastecimentos;
    }

    public void setAbastecimentos(List<String> abastecimento) {
        this.abastecimentos = abastecimento;
    }
}
