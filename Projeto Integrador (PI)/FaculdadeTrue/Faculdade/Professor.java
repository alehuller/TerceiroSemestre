package Faculdade;

public class Professor {
	private String nome;
	private String rgf;
	private String rg;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRgf() {
		return rgf;
	}
	public void setRgf(String rgf) {
		this.rgf = rgf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public Professor(String nome, String rgf, String rg) {
		this.nome = nome;
		this.rgf = rgf;
		if (verificaRGProfessor(this.rg = rg)) {
			System.out.println("RG válido!");
		}
		else {
			System.out.println("RG inválido!");
			System.exit(0);
		}
	}
	public Professor() {
	}
	
	private static boolean verificaRGProfessor(String rg) {
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
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "=====================================" + "\nProfessor [nome=" + nome + ", rgf=" + rgf + ", rg=" + rg + "]" + "\n=====================================\n";
	}
	
	
}
