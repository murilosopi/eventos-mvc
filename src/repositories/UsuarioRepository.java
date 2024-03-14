package repositories;

import java.util.HashSet;
import java.util.Iterator;

import models.Usuario;

public class UsuarioRepository {
	private HashSet<Usuario> usuarios;
	
	public UsuarioRepository() {
		this.usuarios = new HashSet<Usuario>();
	}
	
	public HashSet<Usuario> getUsuarios() {
		return new HashSet<Usuario>(this.usuarios);
	}

	public void setUsuarios(HashSet<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public boolean addUsuario(Usuario usuario) {
		return this.usuarios.add(usuario);
	}
	
	public Usuario getUsuario(int id) {
		Usuario u = null;
		
		Iterator<Usuario> usuario = usuarios.iterator();
		
		for(Usuario i = null; usuario.hasNext(); i = usuario.next()) {
			if(i.getId() == id) {
				u = new Usuario(i);
				break;
			}
		}
		
		return u;
	}
	
	
}
