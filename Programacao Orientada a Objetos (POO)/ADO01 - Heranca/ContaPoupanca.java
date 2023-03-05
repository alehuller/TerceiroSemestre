/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
//
/*
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaPoupanca estenda a classe Conta 
 * 2) Adicione o atributo data de aniversario (dataAniversario) a classe ContaPoupanca,
 *  declarando-o como String e encapsule o atributo 
 * 3) Crie um construtor para a classe ContaPoupanca obrigando a passagem da data de 
 *  aniversario e todos os parametros necessarios para abertura de Conta 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima
 *  tambem a data de aniversario e o tipo da conta (CONTA POUPANCA) em seu cabecalho
 */
public class ContaPoupanca extends Conta{
	
	private String dataAniversario;

	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	public ContaPoupanca (String dataAniversario, double saldoInicial, String num, Cliente tit, Agencia ag) {
		super (saldoInicial, num, tit, ag);
		this.dataAniversario = dataAniversario;
	}
	
	public void imprimeDados() {
        System.out.println("======================================");
        System.out.println("CONTA POUPANCA");
        super.imprimeDados();
        System.out.println("Data de Aniversario: " + getDataAniversario());
        System.out.println("========================================");
    }
}
