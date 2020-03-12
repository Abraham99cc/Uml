package Uml;

import java.time.Year;

public class Peliculas {
	private String titulo;
	private Year agno;
	private String sipnosis;
	private Genero genero;
	private String pais;
	private Trailer trailer;

	public java.util.Collection actor = new java.util.TreeSet();
	public java.util.Collection director = new java.util.TreeSet();
	public java.util.Collection productor = new java.util.TreeSet();
	public java.util.Collection guionista = new java.util.TreeSet();
	
	
	
public Peliculas() {
	trailer = new Trailer();
}
	
	


}
