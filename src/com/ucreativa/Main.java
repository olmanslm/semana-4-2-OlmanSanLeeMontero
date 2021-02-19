/**
 * 
 */
package com.ucreativa;

/**
 * @author Olman
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Arbol arb1 = new Arbol( "Culantro",  "tipo1",  "Verde",  "Epa",  "ciencia",  3.3);
		
		arb1.florear();
		arb1.setNombre("Manzano");
		System.out.println(arb1.toString());
		
		
		
		Persona profe = new Profesor("Olman", 30, "123123123","olman.san@ucreativa.com", 8, 9999.1);
		
		profe.divertir();
	}

}
