public class Pessoa {

    //Atributos da classe

    private String nome;
    private int idade;
    private int id;

    public Pessoa(String nome, int idade, int id) {
        
    }

    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
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
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "{" + "nome=" + nome + ", idade=" + idade + ", id = " + id + "}";
    }
    
}