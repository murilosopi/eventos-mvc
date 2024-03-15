package models;

public enum CategoriaEvento {
	FESTA(1),
	ESPORTE(2),
	SHOW(3),
	PALESTRA(4),
	STAND_UP(5),
	TEATRO(6);
	
	private int codigo;
	
	CategoriaEvento(int c) {
		this.codigo = c;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public static CategoriaEvento fromCodigo(int x) {
		switch(x) {
			case 1: return FESTA;
			case 2: return ESPORTE;
			case 3: return SHOW;
			case 4: return PALESTRA;
			case 5: return STAND_UP;
			case 6: return TEATRO;
		}
        return null;
    }
	
}
