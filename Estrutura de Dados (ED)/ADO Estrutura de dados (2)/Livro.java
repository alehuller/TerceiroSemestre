/*

===========================================

Alunos:

Alejandro Huller Borges da Silva
Victor Hugo Enriquetto Marques da Cruz

===========================================

Elabore um projeto Java com uma classe Livro com os atributos: id (int), autor, título
(ambos Strings) e preço (double). Escreva os métodos getters e setters, dois
construtores (no mínimo) e o método toString.
Na segunda classe, defina:
● Um array de objetos (defina-o como array da classe);  ✔       
● Um método para inserir objetos (use a lógica para redimensionar o array); ✔
● Um método para remover por id, um objeto do array; ✔
● Um método para ordenar os dados.  ✔
● Um método para realizar a busca binária por título, retorne todas as
informações relacionadas ao objeto pesquisado. ✔
 Para realizar a busca binária, os dados devem estar ordenados. Utilize, 
obrigatoriamente, o método quick sort ou merge sort na versão passada em aula. ✔
 O id deve ser gerado aleatoriamente (✔) e não duplicado (✔).
Na classe principal, instancie a classe Livro. Teste com, no mínimo, dez objetos. ✔

===========================================
 */

public class Livro {

    private int id;
    private String autor, titulo;
    private double preco;


    public Livro() {
    }
    public Livro(String autor, String titulo, double preco) {
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Título do Livro: " + titulo + ", Autor do livro: " + autor + ", Preço do livro: " + preco + ", ID do livro: " + id;
    }
    public static void main(String[] args) {
    ArrayLivros.inserir(new Livro("Jeff Kinney", "Diário de um Banana", 25));
    ArrayLivros.inserir(new Livro("Robert D. San Souci", "Mulan", 30));
    ArrayLivros.inserir(new Livro("Claude Falbriard", "Computação Quântica", 50));
    ArrayLivros.inserir(new Livro("C. S. Lewis", "Narnia", 70));
    ArrayLivros.inserir(new Livro("Willian Gibson", "Neuromancer", 50));
    ArrayLivros.inserir(new Livro("Paulo Coelho", "O Alquimista", 19));
    ArrayLivros.inserir(new Livro("J. R. R. Tolkien", "Hobbit", 40));
    ArrayLivros.inserir(new Livro("J. R. R. Tolkien", "Silmarillion", 34));
    ArrayLivros.inserir(new Livro("Suzanne Collins", "Jogos Vorazes", 60));
    ArrayLivros.inserir(new Livro("Gabrielle-Suzanne", "A Bela e a Fera", 30)); 
    ArrayLivros.exibir();
    System.out.println("");
    ArrayLivros.pesquisarNome("jogos vorazes");
    System.out.println("");
    System.out.println("Array ordenado pelo mergeSort do método de pesquisa:");
    ArrayLivros.exibir();
    }
}