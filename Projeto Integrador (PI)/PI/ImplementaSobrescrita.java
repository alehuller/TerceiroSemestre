package PI;

public class ImplementaSobrescrita {
    public static void main(String[] args) {
        SuperClasse superClasse = new SuperClasse();
        superClasse.metodoImprimir();
        
        ClasseFilha classeFilha = new ClasseFilha();
        classeFilha.metodoImprimir();
    }    
}
