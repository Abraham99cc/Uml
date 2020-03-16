package Rugby;

import java.util.ArrayList;
import java.util.Collection;

enum Posicion {
	Pilier,
	Talonador,
	Segunda_linea,
	Tercera_linea,
	Medio_melé,
	Apertura,
	Centro,
	Ala,
	Zaguero;

}
public class Jugador extends Persona {
	private Posicion posicion;
	 
	public java.util.Collection capitan = new java.util.TreeSet();
	
	private Collection equipo = new ArrayList<Equipo>();

}
