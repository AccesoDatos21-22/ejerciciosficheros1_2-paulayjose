package org.madrid.ad.ut01.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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
		
		return 0;
	}

	@Override 
	public int palabrasPentavocalica(String rutaFichero) {
		
		return 0;
	}

	@Override
	public int palabraMasLarga(String rutaFichero) {
		
		return 0;
	}

	@Override
	public int frecuenciaVocales(String rutaFichero) {
		FileReader fr = null;
		int res = 0;
		int caracter = 0;
		char car;
		
		try {
			fr = new FileReader(new File (rutaFichero));
			
			caracter = fr.read();
			car = (char) caracter;
			Character.toLowerCase(car);
			
			while (caracter != -1) {
				if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
					res++;
				}
				else if (car == 'á' || car == 'é' || car == 'í' || car == 'ó' || car == 'ú') {
					res++;
				} //Creemos que no nos funciona la selección de vocales con tilde pese a incluirlas.
				else if (car == 'à' || car == 'è' || car == 'ì' || car == 'ò' || car == 'ù') {
					res++;
				}
				caracter = fr.read();
				car = (char) caracter;
				Character.toLowerCase(car);
			}
		}
		catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
		catch (Exception e){
			System.err.println(e.getMessage());
		}
		finally {
			try {
				fr.close();
			}
			catch (IOException e) {
				System.err.println(e.getMessage());;
			}
		}
		return res;
	}

	@Override
	public int frecuenciaLetras(String rutaFichero) {
		
		return 0;
	}
}
