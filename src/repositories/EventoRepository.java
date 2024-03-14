package repositories;

import java.util.HashSet;
import java.util.Iterator;

import models.Evento;

public class EventoRepository {
	private HashSet<Evento> eventos;
	
	public EventoRepository() {
		this.eventos = new HashSet<Evento>();
	}
	
	public boolean addEvento(Evento evento) {
		return this.eventos.add(evento);
	}
	
	public Evento getEvento(int id) {
		Evento e = null;
		
		Iterator<Evento> evento = this.eventos.iterator();
		
		for(Evento i = null; evento.hasNext(); i = evento.next()) {
			if(i.getId() == id) {
				e = new Evento(i);
				break;
			}
		}
		
		return e;
	}
}
