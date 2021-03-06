package org.squadra.atenea.ateneacommunication;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

/**
 * Esta clase representa la estructura del mensaje que comparten el cliente y el servidor.
 * 
 * @author Ricardo, Leandro
 */
public class Message {
	
	// Constantes que representan los tipos de mensaje
	public static final int DEFAULT = 0;
	public static final int ASSERTION = 1;
	public static final int QUESTION = 2;
	public static final int ORDER = 3;
	public static final int DIALOG = 4;
	public static final int ERROR = 5;
	public static final int UNKNOWN = 6;
	public static final int STORE_ACTION = 7;
	public static final int LEARN_ACTION = 8;
	public static final int PRELOAD_ACTION = 9;
	public static final int REMOVE_ACTION = 10;
	public static final int PRELOAD_ACTION_WITH_PARAM = 11;
	
	/** Variable para guardar el mensaje de texto de entrada o el mensaje de salida a reproducir */
	@Getter @Setter private String text = "";
	
	/** Variable para almacenar el tipo de mensaje (assertion, question, order, etc). */
	@Getter @Setter private int type = DEFAULT;
	
	/** Variable para guardar la orden de ejecucion de acciones del servidor al cliente */
	@Getter @Setter private String order = "";
	
	/** Fecha de creacion del mensaje */
	@Getter @Setter private Date date;
	
	/** HashMap para almacenar metadata que se enviara junto al mensaje (ej: usuario y clave) */
	@Getter @Setter private HashMap<String, String> metadata;
	
	/** Lista de iconos a ejecutar */
	@Getter @Setter private ArrayList<String> icons; 
	
	/**
	 * Constructor por defecto. Debe estar OBLIGATORIAMENTE para que funcione el web service.
	 */
	public Message() {
		this.date = new Date();
		this.metadata = new HashMap<String, String>();
		this.icons = new ArrayList<String>();
	}
	
	/**
	 * Constructor (sin el tipo de mensaje)
	 * @param text mensaje de entrada o de salida para reproducir
	 */
	public Message(String text) {
		this.text = text;
		this.date = new Date();
		this.metadata = new HashMap<String, String>();
		this.icons = new ArrayList<String>();
	}
	
	/**
	 * Constructor (con el tipo de mensaje)
	 * @param text mensaje de entrada o de salida para reproducir
	 * @param type tipo de mensaje
	 */
	public Message(String text, int type) {
		this.text = text;
		this.type = type;
		this.date = new Date();
		this.metadata = new HashMap<String, String>();
		this.icons = new ArrayList<String>();
	}
	
	public void addMetadata (String key, String value) {
		this.metadata.put(key, value);
	}
	
	public String getMetadata (String key) {
		return this.metadata.get(key);
	}
	
	public void setIcon(String icon)
	{
		icons.add(icon);
	}
	
}
