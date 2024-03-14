package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
	private int id;
	private String nome;
	private LocalDate dataNascimento;
	private List<CategoriaEvento> interesses;
	
	public Usuario(Usuario u) {
		this.id = u.id;
		this.nome = u.nome;
		this.dataNascimento = u.dataNascimento;
		this.interesses = new ArrayList<>(u.interesses);
	}
	
	public int getId() {
		return this.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && id == other.id
				&& Objects.equals(nome, other.nome);
	}
	
	
	
		
}
