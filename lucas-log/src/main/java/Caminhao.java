import java.util.List;

public class Caminhao extends Veiculo implements Transportador {

    public Caminhao(String placa, int anoFabricacao, String combiustivel, List<String> abastecimentos) {
        super(placa, anoFabricacao, combiustivel, abastecimentos);
    }

    @Override
    public void transportar() {
        System.out.println("leva muita carga.");
    }
}
