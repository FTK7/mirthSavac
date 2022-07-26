package scc.ws;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "pacient")
@XmlAccessorType(XmlAccessType.NONE) //Sense binding automatic
@XmlType(propOrder = { "dni", "email", "mobil", "error" })
public class Pacient implements Serializable{
	 /**
	 * Dades del pacient necessàries per fer login
	 */
	private static final long serialVersionUID = 1663453105794674467L;
	private String dni;
	private String email;
	private String mobil;
	private String error;

	@XmlElement(name = "dni")
	public String getDni() {
		return dni;
	}
	
	@XmlElement(name = "email")
	public String getEmail() {
		return email;
	}
	
	@XmlElement(name = "mobil")
	public String getMobil() {
		return mobil;
	}
	
	@XmlElement(name = "error")
	public String getError() {
		return error;
	}
	
	 public void setDni(String newDni) {
		 dni = newDni;
	 }

	 public void setEmail(String newEmail) {
		 email = newEmail;
	 }

	 public void setMobil(String newMobil) {
		 mobil = newMobil;
	 }

	 public void setError(String newError) {
		 error = newError;
	 }
}