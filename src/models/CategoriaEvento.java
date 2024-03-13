package models;

public enum CategoriaEvento {
	FESTA(1),
	ESPORTE(2),
	SHOW(3),
	PALESTRA(4),
	STAND_UP(6),
	TEATRO(7);
	
	private int codigo;
	
	CategoriaEvento(int c) {
		this.codigo = c;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
}
