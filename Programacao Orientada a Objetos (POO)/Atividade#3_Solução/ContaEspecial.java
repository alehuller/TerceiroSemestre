/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
//

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(double limite, double saldoInicial, String num, Cliente tit, Agencia ag) {
        super(saldoInicial, num, tit, ag);
        setLimite(limite);
    }

    public ContaEspecial(double limite, String num, Cliente tit, Agencia ag) {
        super(num, tit, ag);
        setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void imprimeDados() {
        System.out.println("======================================");
        System.out.println("CONTA ESPECIAL");
        super.imprimeDados();
        System.out.println("Limite: " + getLimite());
        System.out.println("========================================\n");
    }

    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + getNumero());
        if (valor > 0) {
            if (saldo + limite >= valor) {
                saldo -= valor;
                acumularCPMF(valor);
            } else {
                System.out.println("Saldo e limite insuficientes");
            }
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }
}
