package br.com.apostilaJavaWebCaelum.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class ContatoFilter implements Filter{

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("-----------------------------------");
		System.out.println("Passou por método do filtro init().");	
		System.out.println("-----------------------------------");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("-----------------------------------");
		System.out.println("Passou por método do filtro doFilter(args).");
		// passa pela porta
	    chain.doFilter(request, response);
	    System.out.println("-----------------------------------");
	}

	public void destroy() {
		System.out.println("-----------------------------------");
		System.out.println("Passou por método do filtro destroy().");	
		System.out.println("-----------------------------------");
	}

}
