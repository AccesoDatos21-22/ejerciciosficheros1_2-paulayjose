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
			
		BufferedReader br = null;
		int res = 1;
		String linea = null;
			
		try {
			br = new BufferedReader(new FileReader (new File(rutaFichero)));
			linea = br.readLine();
				
			while (linea != null) {
				res++;
				linea=br.readLine();
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
