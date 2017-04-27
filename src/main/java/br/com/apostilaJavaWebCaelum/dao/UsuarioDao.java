package br.com.apostilaJavaWebCaelum.dao;

import org.springframework.stereotype.Repository;

import br.com.apostilaJavaWebCaelum.model.Usuario;

@Repository
public class UsuarioDao {

	public boolean existeUsuario(Usuario usuario) {
		if (usuario != null) {
			return true;
		} else {
			return false;
		}
	}

}
