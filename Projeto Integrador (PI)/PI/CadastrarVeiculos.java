package PI;

import javax.swing.JOptionPane;

public class CadastrarVeiculos {
    public static void main(String[] args) {
    String valores[] = {"Caminhão", "Ônibus", "Veiculo"};
    Object escolha = JOptionPane.showInputDialog(null, "Escolha um veiculo", "Cadastro de Veiculo", JOptionPane.INFORMATION_MESSAGE, null, valores, valores[0]);
    Veiculo v;
    if (escolha.equals("Caminhão")){
	v = new Caminhao(
	JOptionPane.showInputDialog("Digite a placa do caminhão: "),
	Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: ")),
        "Caminhão: ",
	Integer.parseInt(JOptionPane.showInputDialog("Digite a carga: "))
	);
    }
    else if (escolha.equals("Ônibus")){
	v = new Onibus(
	JOptionPane.showInputDialog("Digite a placa do ônibus: "),
	Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: ")),
	"Ônibus: ",
	Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de passageiros: "))
	);
    }
    else {
	v = new Veiculo(
	JOptionPane.showInputDialog("Digite a placa do veículo: "),
	Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veículo: ")),
	"Veículo: "
	);
    }		
    v.mostrarDados();
    }
}

