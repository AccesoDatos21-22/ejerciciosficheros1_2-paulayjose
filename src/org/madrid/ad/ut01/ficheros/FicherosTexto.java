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
			
		FileReader fr = null;
		int caracter = 0;
		int res = 0;
			
		try {
			fr = new FileReader(new File(rutaFichero));
			caracter = fr.read();
						
			while (caracter != -1) {
				res++;
				caracter = fr.read();
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
				fr.close();
			}
			catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
			return res;
		}

	@Override
	public int contarLineas(String rutaFichero) {
		
		return 0;
	}

	@Override
	public int contarPalabras(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
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
