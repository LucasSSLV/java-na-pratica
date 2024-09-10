import java.util.List;

public abstract class Veiculo {
    String placa;
    int anoFabricacao;
    String combiustivel;
    List<String> abastecimentos;

    public Veiculo(String placa, int anoFabricacao, String combiustivel, List<String> abastecimentos) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.combiustivel = combiustivel;
        this.abastecimentos = abastecimentos;
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
