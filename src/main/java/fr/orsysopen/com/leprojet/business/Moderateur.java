package fr.orsysopen.com.leprojet.business;

import javax.persistence.Entity;

@Entity
public class Moderateur extends Utilisateur {
	
	private String numeroDeTelephone;
	
	
	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}


	

	public Moderateur() {
		super();
		
	}

	public Moderateur(String numeroDeTelephone) {
		super();
		this.numeroDeTelephone = numeroDeTelephone;
	}

	@Override
	public String toString() {
		return "Moderateur [numeroDeTelephone=" + numeroDeTelephone + "]";
	}
	
	
	

}
