package br.com.apostilaJavaWebCaelum.tarefas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.apostilaJavaWebCaelum.dao.UsuarioDao;
import br.com.apostilaJavaWebCaelum.model.Usuario;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String paginaDeLogin() {
		return "login/formLogin";
	}

	@RequestMapping("efetuarLogin")
	public String efetuarLogin(Usuario usuario, HttpSession session) {
		if (new UsuarioDao().existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "menu/menu";
		} else {
			return "login/formLogin";
		}
	}
}
