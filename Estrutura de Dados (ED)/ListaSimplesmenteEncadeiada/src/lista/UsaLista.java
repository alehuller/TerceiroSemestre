package lista;

public class UsaLista {
    
    public static void main(String[] args) {
        MetodosLista.inserir(new Pet("Canina", "Gaia", 4));
        MetodosLista.inserir(new Pet("Felina", "Mumu", 7));
        MetodosLista.inserir(new Pet("Felina", "Tutu", 8));
        MetodosLista.inserir(new Pet("Felina", "Tcha", 3));
        MetodosLista.inserir(new Pet("Canina", "Nani", 8));
        MetodosLista.exibir();
        
        Object obj = MetodosLista.pesquisar("Tutu");
        if(obj != null) {
            System.out.println(obj);
        }
        else {
            System.out.println("Nao encontrado!");
        }
        
        Pet pet = new Pet("Gaia");
        if(MetodosLista.remover(pet)){
            System.out.println("Removido com sucesso!");
        }
        else {
            System.out.println("Nao removido");
        }
        MetodosLista.exibir();
    }
    
}
