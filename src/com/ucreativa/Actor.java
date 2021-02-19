/**
 * 
 */
package com.ucreativa;

/**
 * @author Olman
 *
 */
public interface Actor {
	public static String nombreArtistico = "Rebeca";
	public static int anniosExperiencia = 6;
	public static String tipo = "Principal";
	
	abstract void actuar();
	
	abstract void divertir();
	
	abstract void desaparecer();
	
	static String identifador() {
		return "Yo soy un Actor";
	}

	@Override
	String toString();

	void finalize() throws Throwable;
	
				
}
