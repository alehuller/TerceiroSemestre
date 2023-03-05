package Fabrica;

public class Funcionario {
    public String nome;
    private String depto;
    private String endereco;
    private String funcao;   

    public Funcionario() {  
    }
    
    public Funcionario(String xx, int valor) {
        System.out.println("Metodo construtor do xx" + xx + " - " + valor);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }  
}
