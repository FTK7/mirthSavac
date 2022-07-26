package scc.ws;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "cita")
@XmlAccessorType(XmlAccessType.NONE) //Sense binding automatic
@XmlType(propOrder = { "dataCita", "horaCita", "hc", "tis", "dni", "nom", "cognom1", "cognom2", "IDCita", "recursID", "recurs", "tipusRecursID", "tipusRecurs", "tipusEco", "entitat", "serveiID", "servei", "bloquejat"})
//@XmlType(propOrder = { "horaCita", "hc"})
public class Cita implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1056133737187641735L;
	private String dataCita;
	private String horaCita;
	private String hc;
	private String tis;
	private String dni;
	private String nom;
	private String cognom1;
	private String cognom2;
	private String IDCita;
	private String recursID;
	private String recurs;
	private String tipusRecursID;
	private String tipusRecurs;
	private String tipusEco;
	private String entitat;
	private String serveiID;
	private String servei;
	private String bloquejat;
	
	@XmlElement(name = "dataCita")
	public String getDataCita() {
		return dataCita;
	}
	public void setDataCita(String dataCita) {
		this.dataCita = dataCita;
	}
	@XmlElement(name = "horaCita")
	public String getHoraCita() {
		return horaCita;
	}
	public void setHoraCita(String horaCita) {
		this.horaCita = horaCita;
	}
	
	@XmlElement(name = "hc")
	public String getHc() {
		return hc;
	}
	public void setHc(String hc) {
		this.hc = hc;
	}

	@XmlElement(name = "tis")
	public String getTis() {
		return tis;
	}
	public void setTis(String tis) {
		this.tis = tis;
	}

	@XmlElement(name = "dni")
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@XmlElement(name = "nom")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@XmlElement(name = "cognom1")
	public String getCognom1() {
		return cognom1;
	}
	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}

	@XmlElement(name = "cognom2")
	public String getCognom2() {
		return cognom2;
	}
	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}
	
	@XmlElement(name = "IDCita")
	public String getIDCita() {
		return IDCita;
	}
	public void setIDCita(String iDCita) {
		IDCita = iDCita;
	}
	
	@XmlElement(name = "recursID")
	public String getRecursID() {
		return recursID;
	}
	public void setRecursID(String recursID) {
		this.recursID = recursID;
	}
	
	@XmlElement(name = "recurs")
	public String getRecurs() {
		return recurs;
	}
	public void setRecurs(String recurs) {
		this.recurs = recurs;
	}

	@XmlElement(name = "tipusRecursID")
	public String getTipusRecursID() {
		return tipusRecursID;
	}
	public void setTipusRecursID(String tipusRecursID) {
		this.tipusRecursID = tipusRecursID;
	}

	@XmlElement(name = "tipusRecurs")
	public String getTipusRecurs() {
		return tipusRecurs;
	}
	public void setTipusRecurs(String tipusRecurs) {
		this.tipusRecurs = tipusRecurs;
	}
	@XmlElement(name = "tipusEco")
	public String getTipusEco() {
		return tipusEco;
	}
	public void setTipusEco(String tipusEco) {
		this.tipusEco = tipusEco;
	}
	
	@XmlElement(name = "entitat")
	public String getEntitat() {
		return entitat;
	}
	public void setEntitat(String entitat) {
		this.entitat = entitat;
	}
	
	@XmlElement(name = "serveiID")
	public String getServeiID() {
		return serveiID;
	}
	public void setServeiID(String serveiID) {
		this.serveiID = serveiID;
	}
	
	@XmlElement(name = "servei")
	public String getServei() {
		return servei;
	}
	public void setServei(String servei) {
		this.servei = servei;
	}
	
	@XmlElement(name = "bloquejat")
	public String getBloquejat() {
		return bloquejat;
	}
	public void setBloquejat(String bloquejat) {
		this.bloquejat = bloquejat;
	}
}
