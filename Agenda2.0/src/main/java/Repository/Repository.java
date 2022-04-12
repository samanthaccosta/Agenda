package Repository;

import java.util.List;

import Entity.Contato;


public interface Repository {
	public List<Contato> getContatos();
	public Contato adicionarContato(Contato contato);
	public Contato deletarContato(Contato contato);
	public Contato getId(long id);
	
}


