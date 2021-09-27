package org.madrid.ad.ut01.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.madrid.ad.ut01.ficheros.interfaces.InterfazFicherosTexto;

/**
 * 
 * @author Escribe_aqui_tu_nombre
 * @date
 * @version
 * @license GPLv3
 *
 */
public class FicherosTexto implements InterfazFicherosTexto {

	@Override
	public void leer(String rutaFichero) {
	
	}
	
	@Override
	public int contarCaracteres(String rutaFichero) {

		BufferedReader br = null;
		int cont = 0;

		try {

			br = new BufferedReader(new FileReader(rutaFichero));

			String linea;

			while ((linea = br.readLine()) != null) {

				String contLinea = linea.replace(" ", "");
				cont = cont + contLinea.length();

			}

		} catch (FileNotFoundException e) {
			System.err.println("El fichero no ha sido encontrado ");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

		return cont;
	}	

	@Override
	public int contarLineas(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int contarPalabras(String rutaFichero) {

		return 0;
		
	}

	@Override
	public int palabrasPentavocalica(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int palabraMasLarga(String rutaFichero) {

		return 0;

	}

	@Override
	public int frecuenciaVocales(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int frecuenciaLetras(String rutaFichero) {

		return 0;
		
	}

}
