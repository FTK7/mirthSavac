package scc.ws;
import java.io.StringReader;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.jws.WebParam;

import com.mirth.connect.connectors.ws.AcceptMessage;
import com.mirth.connect.connectors.ws.WebServiceReceiver;

@WebService
public class WS_Savac extends AcceptMessage {

    public WS_Savac(WebServiceReceiver webServiceReceiver) {
		super(webServiceReceiver);
	}

    @WebMethod
    public Pacient dadesRegistre(@WebParam(name = "idUsuari") String idUsuari) {
        String response = webServiceReceiver.processData("dadesRegistre|"+idUsuari);
        Pacient pacient = new Pacient();

        if (response != null) {
        	 try {
	        		 JAXBContext jaxbContext = JAXBContext.newInstance(Pacient.class);
	        		 Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	        		 StringReader reader = new StringReader(response);
	        		 pacient = (Pacient) unmarshaller.unmarshal(reader);
        		 } catch (JAXBException e) {
        		 e.printStackTrace();
        		 }
            return pacient;
        }
        
        return null;
    }
    @WebMethod
    public PacientComplet dadesPacient(@WebParam(name = "idUsuari") String idUsuari) {
    	String response = webServiceReceiver.processData("dadesPacient|"+idUsuari);
        PacientComplet pacientC = new PacientComplet();
        
        if (response != null) {
       	 try {
	        		 JAXBContext jaxbContext = JAXBContext.newInstance(PacientComplet.class);
	        		 Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	        		 StringReader reader = new StringReader(response);
	        		 pacientC = (PacientComplet) unmarshaller.unmarshal(reader);
       		 } catch (JAXBException e) {
       		 e.printStackTrace();
       		 }
           return pacientC;
       }
       
       return null;
    }
    @WebMethod
    public LlistaCites citesFutur() {
    	String response = webServiceReceiver.processData("citesFutur");
        LlistaCites llistaC = new LlistaCites();
        
        if (response != null) {
       	 try {
	        		 JAXBContext jaxbContext = JAXBContext.newInstance(LlistaCites.class);
	        		 Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	        		 StringReader reader = new StringReader(response);
	        		 llistaC = (LlistaCites) unmarshaller.unmarshal(reader);
       		 } catch (JAXBException e) {
       		 e.printStackTrace();
       		 }
           return llistaC;
       }
       
       return null;
    }
    /*
    @WebMethod
    public Pacient dadesPacient(@WebParam(name = "idUsuari") String idUsuari) {
        String response = webServiceReceiver.processData("dadesPacient|"+idUsuari);
        Pacient pacient = new Pacient();

        if (response != null) {
        	 try {
	        		 JAXBContext jaxbContext = JAXBContext.newInstance(Pacient.class);
	        		 Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	        		 StringReader reader = new StringReader(response);
	        		 pacient = (Pacient) unmarshaller.unmarshal(reader);
        		 } catch (JAXBException e) {
        		 e.printStackTrace();
        		 }
            return pacient;
        }
        
        return null;
    }*/
}