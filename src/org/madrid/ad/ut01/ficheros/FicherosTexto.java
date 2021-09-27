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

	@Override //No hemos conseguido eliminar la repetición de palabras que terminaban con "," ";" "." 
	public int palabrasPentavocalica(String rutaFichero) { //Pero si eliminar las palabras exactamente iguales.
		BufferedReader br = null;
		int res = 0;
		String linea = null;
		String[] palabras = null;
		ArrayList<String> penta = new ArrayList<String>();
		boolean sino = false;
		
		
		try {
			br = new BufferedReader(new FileReader (new File(rutaFichero)));
			linea = br.readLine();
			
			while (linea != null) {
				palabras = linea.split(" "); //Separamos cada palabra con el método split(" ") en un array.
				
				for (int i=0; i<palabras.length; i++) { //Recorremos el array palabras
					sino = false; //Al inicio de cada ciclo asignamos false a la variable booleana.
					if (palabras[i].toLowerCase().contains("a") && palabras[i].toLowerCase().contains("e") && palabras[i].toLowerCase().contains("i") && palabras[i].toLowerCase().contains("o") && palabras[i].toLowerCase().contains("u")){
					//Si la palabra contiene todas las vocales...
						if (penta.isEmpty()) { //La añadimos si nuestro arrayList está vacío
							penta.add(palabras[i]);
							res++; //La contabilizamos.
							System.out.println(palabras[i]); //Y la mostramos
						}
						else {
							for (int j = 0; j < penta.size(); j++) { //Si la palabra coincide con alguna almacenada la descartamos.
								if (palabras[i].equalsIgnoreCase(penta.get(j))) {
									sino = true;
									break;
								}
							}
							if (!(sino)) {
								penta.add(palabras[i]); //La añadimos al arrayList
								System.out.println(palabras[i]); //La mostramos
								res++; //Y después la contamos.
							}
						}
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
