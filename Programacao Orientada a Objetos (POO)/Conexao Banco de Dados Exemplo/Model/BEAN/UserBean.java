package Model.BEAN;

import Model.DAO.ConectarDAO;
import java.sql.Connection;
import Model.Entity.Usuario;
import Model.DAO.UsuarioDAO;
import Model.Entity.Usuario;

public class UserBean {
	public Usuario signInUsuario (String nome) {
		Usuario usuario = null;
		UsuarioDAO user = new UsuarioDAO();
	    usuario = user.acessarUsuario(nome);
	    return usuario;
	}
}
