package Rugby;

import java.util.ArrayList;
import java.util.Collection;

public class Partido {
	private int puntosLocal;
	private int puntosVisitante;
	private int bonusLocal;
	private int bonusVisitante;
	
	public Arbitro arbitro;
	
	public Equipo Local;
	public Equipo Visitante;
	
	private Collection jornadas;
	private Collection estadio = new ArrayList<Estadio>();
	private Collection equipo = new ArrayList<Equipo>();
	
	

	
	public Partido() {

        jornadas = new ArrayList<Jornada>();

    }
	public void resultado() {
		
	}
	
	
}


