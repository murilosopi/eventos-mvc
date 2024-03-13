package models;

import java.time.LocalDateTime;
import models.CategoriaEvento;

public class Evento {
	private String nome;
	private String endereco;
	private CategoriaEvento categoria;
	private LocalDateTime horario;
	private String descricao;
}
