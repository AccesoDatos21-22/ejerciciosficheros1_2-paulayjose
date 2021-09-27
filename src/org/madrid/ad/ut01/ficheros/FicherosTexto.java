package org.madrid.ad.ut01.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.madrid.ad.ut01.ficheros.interfaces.InterfazFicherosTexto;

/**
 * 
 * @author Jose Viñas
 * @date 27/09/2021
 * @version 
 * @license GPLv3
 *
 */
public class FicherosTexto implements InterfazFicherosTexto{

	@Override
	public void leer(String rutaFichero) {
		
		
	}

	@Override
	public int contarCaracteres(String rutaFichero) {	
		
		return 0;
	}

	@Override
	public int contarLineas(String rutaFichero) {
			
		return 0;
}

	@Override
	public int contarPalabras(String rutaFichero) {
		
		BufferedReader br = null;
		int res = 0;
		String linea = null;
		String[] palabras = null;
		boolean sino = false;
		
		try {
			br = new BufferedReader(new FileReader (new File(rutaFichero)));
			linea = br.readLine();
			
			while (linea != null) {
				palabras = linea.split(" "); //Separamos cada palabra con el método split(" ") en un array.
				
				for (int i=0; i<palabras.length; i++) { //Recorremos el array palabras 
					if (palabras[i].toLowerCase().contains("a") && palabras[i].toLowerCase().contains("e") && palabras[i].toLowerCase().contains("i") && palabras[i].toLowerCase().contains("o") && palabras[i].toLowerCase().contains("u")){
						sino = true; //Si la palabra contiene todas las vocales pasaremos la variable booleana a true
					}
					if (sino) { //Si la variable es true...
						System.out.println(palabras[i]);
						res++; //Sumaremos al contador +1
						sino = false; //Volveremos a poner la variable booleana a false
					}
				}
				linea=br.readLine(); //Leemos la siguiente línea.
			}
		}
		catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				br.close();
			}
			catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		return res;
	}

	@Override
	public int palabrasPentavocalica(String rutaFichero) {
		
		return 0;
	}

	@Override
	public int palabraMasLarga(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int frecuenciaVocales(String rutaFichero) {
		
		return 0;
	}

	@Override
	public int frecuenciaLetras(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}
}
