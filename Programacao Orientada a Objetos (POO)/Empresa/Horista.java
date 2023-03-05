package Empresa;

public class Horista extends Colaborador{
    private double valorHora;
    private double cargaHoraria;
    
    public Horista (String funcional, String nomeColab, String enderecoColab, String dataAdmissaoColab, double valorHora, double cargaHoraria) {
        super(funcional, nomeColab, enderecoColab, dataAdmissaoColab);
        this.valorHora = valorHora;
        this.cargaHoraria = cargaHoraria;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}
