package org.squadra.atenea.ateneacommunication;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Esta clase es el webservice que expone los metodos que se utilizan desde 
 * AteneaClient
 * 
 * @author tempuses
 */
@WebService
public interface AteneaWs {

	/**
	 * Metodo que permite dialogar con el servidor Atenea
	 * @param message es el mensaje que va a enviar el cliente al servidor
	 * @return mensaje de respuesta del servidor al cliente
	 * @author tempuses
	 */
	
	String dialogString( @WebParam(name="message")  String message );
	
	Message dialog( @WebParam(name="message")  Message message );
}
