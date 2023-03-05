package Faculdade;

public class Aluno {
	private String nome;
	private String ra;
	private String rg;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public Aluno(String nome, String ra, String rg) {
		this.nome = nome;
		this.ra = ra;
		if (verificaRG(this.rg = rg)) {
			System.out.println("RG válido!");
		}
		else {
			System.out.println("RG inválido!");
			System.exit(0);
		}
	}
	public Aluno() {
	}
	
	private static boolean verificaRG(String rg) {
		int a = rg.charAt(0) - '0';
		int b = rg.charAt(1) - '0';
		int c = rg.charAt(2) - '0';
		int d = rg.charAt(3) - '0';
		int e = rg.charAt(4) - '0';
		int f = rg.charAt(5) - '0';
		int g = rg.charAt(6) - '0';
		int h = rg.charAt(7) - '0';
		int i = rg.charAt(8) - '0';
		
		int resultado = (a*2) + (b*3) + (c*4) + (d*5) + (e*6) + (f*7) + (g*8) + (h*9) + (i*100);
		int verifica = resultado % 11;
		if (verifica == 0) {
			return true;
			
		}
		return false;
	}
	@Override
	public String toString() {
		return "=====================================" + "\nAluno [nome=" + nome + ", ra=" + ra + ", rg=" + rg + "]" + "\n=====================================\n";
	}
	
	
}
