package scc.ws;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "pacientComplet")
@XmlAccessorType(XmlAccessType.NONE) //Sense binding automatic
@XmlType(propOrder = { "nom", "cognom1", "cognom2", "nif", "dataNaixement", "tipusVia", "nomVia", "num", "bloc", "portal", "pis", "porta", "escala", "codiPostal", "tel1", "tel2", "email", "error"})
public class PacientComplet implements Serializable{
	 /**
	 * Dades del pacient necessàries per fer login
	 */
	private static final long serialVersionUID = 1663453105794674467L;
	private String nom;
	private String cognom1;
	private String cognom2;
	private String nif;
	private String dataNaixement;
	private String tipusVia;
	private String nomVia;
	private String num;
	private String bloc;
	private String portal;
	private String pis;
	private String porta;
	private String escala;
	private String codiPostal;
	private String tel1;
	private String tel2;
	private String email;
	private String error;

	@XmlElement(name = "nom")
	public String getNom() {
		return nom;
	}
	
	@XmlElement(name = "cognom1")
	public String getCognom1() {
		return cognom1;
	}
	
	@XmlElement(name = "cognom2")
	public String getCognom2() {
		return cognom2;
	}
	
	@XmlElement(name = "error")
	public String getError() {
		return error;
	}
	
	 public void setNom(String newNom) {
		 nom = newNom;
	 }

	 public void setCognom1(String newCognom1) {
		 cognom1 = newCognom1;
	 }

	 public void setCognom2(String newCognom2) {
		 cognom2 = newCognom2;
	 }

	 public void setError(String newError) {
		 error = newError;
	 }
	 
	@XmlElement(name = "nif")
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	@XmlElement(name = "dataNaixement")
	public String getDataNaixement() {
		return dataNaixement;
	}
	public void setDataNaixement(String dataNaixement) {
		this.dataNaixement = dataNaixement;
	}
	
	@XmlElement(name = "tipusVia")
	public String getTipusVia() {
		return tipusVia;
	}
	public void setTipusVia(String tipusVia) {
		this.tipusVia = tipusVia;
	}
	
	@XmlElement(name = "nomVia")
	public String getNomVia() {
		return nomVia;
	}
	public void setNomVia(String nomVia) {
		this.nomVia = nomVia;
	}
	
	@XmlElement(name = "num")
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}

	@XmlElement(name = "portal")
	public String getPortal() {
		return portal;
	}
	public void setPortal(String portal) {
		this.portal = portal;
	}
	
	@XmlElement(name = "porta")
	public String getPorta() {
		return porta;
	}
	public void setPorta(String porta) {
		this.porta = porta;
	}
	
	@XmlElement(name = "bloc")
	public String getBloc() {
		return bloc;
	}
	public void setBloc(String bloc) {
		this.bloc = bloc;
	}
	
	@XmlElement(name = "pis")
	public String getPis() {
		return pis;
	}
	public void setPis(String pis) {
		this.pis = pis;
	}
	
	@XmlElement(name = "escala")
	public String getEscala() {
		return escala;
	}
	public void setEscala(String escala) {
		this.escala = escala;
	}
	
	@XmlElement(name = "codiPostal")
	public String getCodiPostal() {
		return codiPostal;
	}
	public void setCodiPostal(String codiPostal) {
		this.codiPostal = codiPostal;
	}
	
	@XmlElement(name = "tel1")
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	
	@XmlElement(name = "tel2")
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	
	@XmlElement(name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}