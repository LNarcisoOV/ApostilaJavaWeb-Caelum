package br.com.apostilaJavaWebCaelum.dao;

import br.com.apostilaJavaWebCaelum.model.Usuario;

public class UsuarioDao {

	public boolean existeUsuario(Usuario usuario) {
		if (usuario != null) {
			return true;
		} else {
			return false;
		}
	}

}
