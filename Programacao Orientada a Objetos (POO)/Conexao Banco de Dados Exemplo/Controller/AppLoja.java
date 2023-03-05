package Controller;

import View.InteracaoUsuario;
import Model.BEAN.UserBean;
import Model.Entity.Usuario;

public class AppLoja {
	public static void main(String[] args) {
		InteracaoUsuario tela = new InteracaoUsuario();
		tela.boasVindas();
		String nomeUsuario = tela.entradaUsuario();
		System.out.println(nomeUsuario);
		UserBean user = new UserBean();
		Usuario usuarioOk = user.signInUsuario(nomeUsuario);
		if(usuarioOk != null) {
			System.out.println("Não Existe");
		}
		else {
			System.out.println("Usuario Existe");
		}
	}
}
