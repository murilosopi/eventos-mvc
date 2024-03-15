package services;

import java.time.LocalDateTime;

import models.CategoriaEvento;
import models.Evento;
import repositories.EventoRepository;
import repositories.UsuarioRepository;

public class EventoService {

	private EventoRepository er;
	private UsuarioRepository ur;
	
	public EventoService() {
		this.er = new EventoRepository();
		this.ur = new UsuarioRepository();
	}
	
	public boolean addEvento(String nome, String endereco, 
			int codigoCategoria, LocalDateTime dataHora, 
			String descricao
	) {
		
		CategoriaEvento categoria = CategoriaEvento.fromCodigo(codigoCategoria);
		
		Evento e = new Evento(nome, endereco, categoria, dataHora, descricao);
		
		return this.er.addEvento(e);
	}
	
}
