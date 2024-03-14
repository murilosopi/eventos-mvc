package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {
	private int id;
	private String nome;
	private String endereco;
	private CategoriaEvento categoria;
	private LocalDateTime horario;
	private String descricao;
	private List<Usuario> participantes;
	
	public Evento(Evento e) {
		this.id = e.id;
		this.nome = e.nome;
		this.endereco = e.endereco;
		this.categoria = e.categoria;
		this.horario = e.horario;
		this.descricao = e.descricao;
		
		this.participantes = new ArrayList<Usuario>(e.participantes.size());
	}

	public int getId() {
		return id;
	}
}