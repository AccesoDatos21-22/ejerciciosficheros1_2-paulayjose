package org.madrid.ad.ut01.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

import org.madrid.ad.ut01.ficheros.interfaces.InterfazFicherosTexto;

/**
 * 
 * @author Paula y Jose
 * @date 27/09/2021
 * @version 
 * @license GPLv3
 *
 */
public class FicherosTexto implements InterfazFicherosTexto{

	@Override
	public void leer(String rutaFichero) {
		
		FileReader fr = null;
		int caracter = 0;

		try {
			fr = new FileReader(new File(rutaFichero));
			caracter = fr.read();

			while (caracter != -1) {
				System.out.print((char) caracter);
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

		BufferedReader br = null;
		int frecuencia = 0;

		try {

			br = new BufferedReader(new FileReader(rutaFichero));

			String linea;

			while ((linea = br.readLine()) != null) {

				// Creemos que no nos coge los parentesis debido a que hemos remplazado bastantes cosas
				linea = linea.replaceAll("[., ,, ;,  :, -, ', ?, ¿, !, ¡, (, )]", "").toLowerCase();

				frecuencia += linea.length();
			}

		} catch (FileNotFoundException e) {
			System.err.println("El fichero no ha sido encontrado");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

		return frecuencia;

	}
}
