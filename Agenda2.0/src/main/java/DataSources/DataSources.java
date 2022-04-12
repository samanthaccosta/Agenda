package DataSources;

import java.util.List;

import Model.ContatoModel;

public interface DataSources {
	
	public List<ContatoModel> getContatos();

	public ContatoModel adicionarContato();
	
	public ContatoModel deletarContato();

	public ContatoModel getById(long id);

}
