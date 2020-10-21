package iespablopicasso.es;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero {

	String ruta = "";
	String nombreFichero = "";
	File file;
	ArrayList<String> coleccionPeliculas = new ArrayList<String>();

	public Fichero() {
		file = new File(indicarDirectorio());
	}

	public String indicarDirectorio() {
		System.out.println("Por favor introduce el directorio");
		Scanner sc = new Scanner(System.in);
		return ruta = sc.nextLine();
	}
	
/**
 * Método que almacena los objetos "peliculas"	en la coleccion para mostrarlo posteriormente
 */
	
	public void crearPeliculas() {

		File[] files = file.listFiles();
		File[] peliculas;
		
		for (int i = 0; i < files.length; i++) {
			peliculas = files[i].listFiles();
			for (int j = 0; j <= peliculas.length - 1; j++) {
				String nombrePelicula = peliculas[j].getName();
				Peliculas pelicula = new Peliculas(nombrePelicula, files[i].getName());
				// System.out.println(pelicula.serializar());
				coleccionPeliculas.add(pelicula.serializar());
			}
		}

	}
	
	/**
	 * Método que crea cualquier fichero csv con los datos que haya cogido de la ubicacion que tu le hayas proporcionado 
	 * y te lo crea en la ubicacion y con el nombre que le pongas al archivo
	 */

	public void crearCSV() { //NO CREAR EL FICHERO EN EL MISMO SITIO DONDE SE ENCUENTRAN LOS DIRECTORIOS QUE TU HAS MARCADO

		System.out.println(
				"Por favor introduce el directorio donde crear el fichero mas el nombre del fichero con la extension");
		Scanner sc = new Scanner(System.in);
		ruta = sc.nextLine();
		nombreFichero = sc.nextLine();

		String ubicacion = ruta + "\\" + nombreFichero;

		File fichero = new File(ubicacion);

		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
				BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero));

				for (String string : coleccionPeliculas) {
					escritor.write(string + "\n");
				}
				escritor.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Fichero creado");
			
		} else {
			System.out.println("el fichero ya existe");
		}

	}

}
