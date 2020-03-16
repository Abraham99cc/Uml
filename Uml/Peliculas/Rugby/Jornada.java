package Rugby;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Jornada {
	private Date fecha;
	
	private Partido partido;
	
	private Collection torneos;
	
	public Jornada() {

        torneos = new ArrayList<Torneo>();

    }
}
