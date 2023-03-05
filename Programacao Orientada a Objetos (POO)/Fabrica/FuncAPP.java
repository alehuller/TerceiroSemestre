package Fabrica;

public class FuncAPP {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        FuncionarioMensalista mensal = new FuncionarioMensalista();
        FuncionarioHorista hora = new FuncionarioHorista();
        FuncionarioTarefa tarefa = new FuncionarioTarefa();
    }
}
