package CadastraAluno;
public class Aluno {
	private String nome, telefone;
	private int id;

	public Aluno(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	public Aluno() {}
	@Override
	public String toString() {
		return "Aluno Nome=" + nome + "\nTelefone=" + 		telefone + "\nID: " + id + "\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getTelefone(){
		return telefone;
	}
}
