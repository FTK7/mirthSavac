package scc.ws;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "llistaCites")
@XmlAccessorType(XmlAccessType.NONE) //Pas de binding automatiques
public class LlistaCites implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "cita")
	private ArrayList<Cita> llistaCites = new ArrayList<Cita>();

	
	 public ArrayList<Cita> getLlistaCites() {
		 return llistaCites;
	 }

	 public void setLlistaCites(ArrayList<Cita> novaLlistaCites) {
		 this.llistaCites = novaLlistaCites;
	 }

	 public void addCita(Cita novaCita) {
		 this.llistaCites.add(novaCita);
	 }
}
