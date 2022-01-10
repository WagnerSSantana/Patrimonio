package br.com.softplan.sistemadepatrimonio.controller;




import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import br.com.softplan.sistemadepatrimonio.dao.UsuarioDAO;
import br.com.softplan.sistemadepatrimonio.model.UsuarioEntity;
import br.com.softplan.sistemadepatrimonio.util.JpaUtil;
import br.com.softplan.sistemadepatrimonio.view.LoginView;
import br.com.softplan.sistemadepatrimonio.view.MenuView;
import br.com.softplan.sistemadepatrimonio.view.TelaPrincipalView;

public class LoginController {

	private LoginView view;

	public LoginController(LoginView view) {
		this.view = view;
	}
	
	


	public void autenticar() {
		String usuario = view.getTxtUsuario().getText();
		String senha = view.getTxtSenha().getText();
		
		
		UsuarioEntity usuarioAutenticar = new UsuarioEntity(usuario,senha);
		EntityManager em = JpaUtil.getEntityManager();
		UsuarioDAO usuarioDao = new UsuarioDAO(em);
		
		boolean existe = usuarioDao.existeNoBancoPorUsuarioESenha(usuarioAutenticar);
	
		if (existe) {
			
			TelaPrincipalView telaPrincipal = new TelaPrincipalView();
			telaPrincipal.setVisible(true);
		}else {
			
			JOptionPane.showMessageDialog(view, "Usuario ou senha invalidos!");
		}	
		
	}
	
	

}
