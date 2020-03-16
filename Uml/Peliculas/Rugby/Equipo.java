package Rugby;

import java.util.ArrayList;
import java.util.Collection;

enum Pais {
	Escocia,
	Francia,
	Gales,
	Inglaterra,
	Irlanda,
	Italia;
}

public class Equipo {
	private Pais nombre;
	

	private Collection partidos = new ArrayList<Partido>();
	private Collection entrenador = new ArrayList<Entrenador>();
	private Collection jugadores = new ArrayList<Jugador>();
	private Collection estadio = new ArrayList<Estadio>();



}
