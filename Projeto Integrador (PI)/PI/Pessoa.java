package PI;

public class Pessoa{
private String nome;
private int idade;
private String endereco;
private String tel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public Pessoa (String nome, int idade,String endereco, String tel){
super();
        this.nome = nome;
this.idade = idade;
this.endereco = endereco;
this.tel = tel;
}
    
    @Override
	public String toString() {
		return "Nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + 
				", tel=" + tel ;
	}

    public static void main (String args[]){
Pessoa p = new Pessoa("Leandro", 25, "Rua XV", "2586-3247");
String str = p.toString();
System.out.println(str + "\n");
System.out.println(p);
} 
}
