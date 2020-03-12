package Peliculas2;

import java.time.Year;

public class Pelicula {
	
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
		
		
		
	public Pelicula() {
		trailer = new Trailer();
	}
		
	}


