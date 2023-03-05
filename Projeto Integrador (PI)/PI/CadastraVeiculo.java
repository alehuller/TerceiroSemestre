package PI;

public class CadastraVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Onibus onibus = new Onibus("DXG-3592", 1982, 40);
        Caminhao caminhao = new Caminhao("BWE-2712", 1990, 1208);
        
        veiculo.setPlaca("BDE-6419");
        veiculo.setAno(1995);
        
        onibus.setPlaca("CTD-6582");
        
        caminhao.setAno(2003);
        
        veiculo.mostrarDados();
        onibus.mostrarDados();
        caminhao.mostrarDados();
    }
}
