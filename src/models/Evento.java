package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {
	private int id;
	private String nome;
	private String endereco;
	private CategoriaEvento categoria;
	private LocalDateTime dataHora;
	private String descricao;
	private List<Usuario> participantes;
	
	public Evento(String nome, String endereco, CategoriaEvento categoria, LocalDateTime dataHora, String descricao) {
		/*
		 * obter id do último e incrementar
		 * */
		
		this.nome = nome;
		this.endereco = endereco;
		this.categoria = categoria;
		this.dataHora = dataHora;
		this.descricao = descricao;
		
		this.participantes = new ArrayList<Usuario>(participantes.size());
		for(Usuario u : participantes) {
			this.participantes.add(new Usuario(u));
		}
	}
	
	public Evento(Evento e) {
		this.id = e.id;
		this.nome = e.nome;
		this.endereco = e.endereco;
		this.categoria = e.categoria;
		this.dataHora = e.dataHora;
		this.descricao = e.descricao;
		
		this.participantes = new ArrayList<Usuario>(e.participantes.size());
	}

	public int getId() {
		return id;
	}
}