package lista;

public class Pet {
    private String especie;
    private String nome;
    private int idade;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
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

    public Pet(String especie, String nome, int idade) {
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
    }

    public Pet() {
    }
    
    public Pet(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pet{" + "especie=" + especie + ", nome=" + nome + ", idade=" + idade + '}';
    }
    
}
