package PI;

public class Veiculo {
    private String placa, tipo;
    private int ano;
    
    public Veiculo() {
        
    }
    
    public Veiculo(String placa, int ano, String tipo) {
        this.placa = placa;
        this.ano = ano;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostrarDados() {
        System.out.println("\n-----Dados do " + tipo + "-----");
        System.out.println("placa: " + this.getPlaca());
        System.out.println("ano: " + this.getAno());
    }
    
}
