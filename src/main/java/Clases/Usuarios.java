package Clases;

public class Usuarios {
	
	//atributos
	
	private int idusuarios;
	private String usuario;
	private String password;
	private String cedula;
	private String nomber;
	private String email;
	
	
	public Usuarios() {
		super();
	}


	public Usuarios(int idusuarios, String usuario, String password, String cedula, String nomber, String email) {
		
		this.idusuarios = idusuarios;
		this.usuario = usuario;
		this.password = password;
		this.cedula = cedula;
		this.nomber = nomber;
		this.email = email;
	}


	public int getIdusuarios() {
		return idusuarios;
	}


	public void setIdusuarios(int idusuarios) {
		this.idusuarios = idusuarios;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNomber() {
		return nomber;
	}


	public void setNomber(String nomber) {
		this.nomber = nomber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
