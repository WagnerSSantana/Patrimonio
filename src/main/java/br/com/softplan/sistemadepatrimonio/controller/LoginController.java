package br.com.softplan.sistemadepatrimonio.controller;


import java.sql.Connection;

import br.com.softplan.sistemadepatrimonio.model.UsuarioEntity;
import br.com.softplan.sistemadepatrimonio.view.LoginView;

public class LoginController {

	private LoginView view;

	public LoginController(LoginView view) {
		this.view = view;
	}
	
	
	public void autenricar() {
		String usuario = view.getTxtUsuario().getText();
		String senha = view.getTxtSenha().getText();
		
		
		UsuarioEntity usuarioAutenticar = new UsuarioEntity(usuario,senha);
		 // Connection conexao = new Conexao().get
		// https://www.youtube.com/watch?v=gbvVh1738z8&list=PLJIP7GdByOyvpQ7EbzucVHocSAG7_EZQZ&index=9		
		
		
		
		
	}
	
	

}
