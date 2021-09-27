package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {
		
		FicherosTexto ej = new FicherosTexto();
		String ruta = "src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt";
		
		//Ejercicio 6
				System.out.println("\n------------------------------------- \nEjercicio 6\n");
				
				System.out.println("El fichero tiene " + ej.contarPalabras(ruta) + " palabras.");		
	}

}
