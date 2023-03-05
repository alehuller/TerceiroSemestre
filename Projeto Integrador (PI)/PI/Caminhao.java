package PI;

public class Caminhao extends Veiculo{
    private int pesoCarga;
    
    public Caminhao (String placa, int ano, String tipo, int pesoCarga) {
        super (placa, ano, tipo);
        this.pesoCarga = pesoCarga;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Peso da carga: " + this.getPesoCarga());
    }
    
    
}
