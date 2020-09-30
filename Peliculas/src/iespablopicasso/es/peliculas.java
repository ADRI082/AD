package iespablopicasso.es;

import java.util.Scanner;

public class peliculas {

	private String titulo;
	private String year;
	private String calidad;
	private String formato;
	
	public peliculas(String titulo, String year, String calidad, String formato) {
		super();
		this.titulo = titulo;
		this.year = year;
		this.calidad = calidad;
		this.formato = formato;
	}
	
	public peliculas(String pelicula, String directorio) {
		
		this.titulo = pelicula.substring(0, pelicula.indexOf("("));
		this.year = pelicula.substring(pelicula.indexOf("(")+1, pelicula.indexOf(")"));
		this.calidad = directorio;
		this.formato =  pelicula.substring(pelicula.indexOf(".")+1, pelicula.length());
	}
	
	public String serializar() {
		
		
		return getTitulo() + ";" + getYear() + ";" + getCalidad() + ";" + getFormato() + ";";
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	
	
	
}
