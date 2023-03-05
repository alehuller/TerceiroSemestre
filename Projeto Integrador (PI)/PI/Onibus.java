package PI;

public class Onibus extends Veiculo{
    private int passageiros;
    
    public Onibus() {
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
    
    public Onibus (String placa, int ano, String tipo, int passageiros) {
        super (placa, ano, tipo);
        this.passageiros = passageiros;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Qtde passageiros: " + this.getPassageiros());
    }    
}
