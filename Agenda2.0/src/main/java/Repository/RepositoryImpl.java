package Repository;

import java.util.List;

import DataSources.DataSourcesImpl;
import Entity.Contato;
import Service.Service;

public  class RepositoryImpl implements Repository{

	final DataSourcesImpl dataSourcesImpl;

	
 
	public RepositoryImpl(DataSourcesImpl dataSourcesImpl) {
		super();
		this.dataSourcesImpl = dataSourcesImpl;
	}

	@Override
	public List<Contato> getContatos() { 
		Service p = new Service ();
		return p.toListaContato(dataSourcesImpl.getContatos());
	}

	public Contato getId(long id) {
		Service contatoModel = new Service();
		return contatoModel.toContato(dataSourcesImpl.getById(id));
	}

	@Override
	public Contato adicionarContato(Contato contato) {
		Service contatoModel = new Service();
		return contatoModel.toContato(dataSourcesImpl.adicionarContato());
	}

	@Override
	public Contato deletarContato(Contato contato) {
		Service contatoModel = new Service();
		return contatoModel.toContato(dataSourcesImpl.deletarContato());
	}


}