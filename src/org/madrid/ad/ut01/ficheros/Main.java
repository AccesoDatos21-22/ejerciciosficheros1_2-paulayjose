package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {
		
		FicherosTexto ej = new FicherosTexto();
		String ruta = "src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt";
		
		//Ejercicio 4
				System.out.println("\n------------------------------------- \nEjercicio 4\n");

				System.out.println("El fichero tiene " + ej.contarCaracteres(ruta) + " caracteres visibles.");
				
		
	}

}
