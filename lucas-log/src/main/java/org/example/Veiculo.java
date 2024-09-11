package org.example;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    protected String placa;
    protected int anoFabricacao;
    protected String combustivel;  // Corrigido: "combustivel"
    protected List<String> abastecimentos;

    // Construtor
    public Veiculo(String placa, int anoFabricacao, String combustivel) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.abastecimentos = new ArrayList<>();  // Inicialização no construtor
    }

    // Método para adicionar um abastecimento
    public void adicionaAbastecimento(String local, String motorista, double valor) {
        String abastecimento = "Local: " + local + ", Motorista: " + motorista + ", Valor: " + valor;
        abastecimentos.add(abastecimento);
    }

    // Getters e setters
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

    public String getCombustivel() {  // Corrigido: "combustivel"
        return combustivel;
    }

    public void setCombustivel(String combustivel) {  // Corrigido: "combustivel"
        this.combustivel = combustivel;
    }

    public void getAbastecimentos() {
    }

    public void setAbastecimentos(List<String> abastecimentos) {
        this.abastecimentos = abastecimentos;
    }

    public void getFullInfos() {

    }
}
