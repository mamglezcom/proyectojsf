package com.mamglez.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author skype
 * clase controlar pantalla login.xhtml
 */
@ManagedBean
public class LoginController {
	
	/**
	 * usuario 
	 */
	private String usuario;
	/**
	 * password
	 */
	private String password;
	/**
	 * @return the usuario
	 */
	
	/**
	 * metodo ingresar pantalla principal
	 */
	public void ingresar() {
		System.out.println("usuario: " + usuario);
		
		if(usuario.equals("miguel") && password.equals("1234")) {
//			FacesContext.getCurrentInstance().addMessage("forLogin:txtUsuario", 
//					new FacesMessage(FacesMessage.SEVERITY_INFO,"usuario correcto",""));
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("forLogin:txtUsuario", 
						new FacesMessage(FacesMessage.SEVERITY_FATAL,"la pagina no existe",""));
				e.printStackTrace();
			}
		}else {
			FacesContext.getCurrentInstance().addMessage("forLogin:txtUsuario", 
					new FacesMessage(FacesMessage.SEVERITY_ERROR,"usuario o contraseña incorrecto",""));

		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
