/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
public class ContaPoupanca extends Conta {

    private String dataAniversario;

    public ContaPoupanca(String dataAniversario, double saldoInicial, String num, Cliente tit, Agencia ag) {
        super(saldoInicial, num, tit, ag);
        setDataAniversario(dataAniversario);
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public void imprimeDados() {
        System.out.println("======================================");
        System.out.println("CONTA POUPANCA");
        super.imprimeDados();
        System.out.println("Data de Aniversario: " + getDataAniversario());
        System.out.println("========================================\n");
    }
}