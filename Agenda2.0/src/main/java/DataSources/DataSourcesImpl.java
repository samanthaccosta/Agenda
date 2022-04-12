package DataSources;

import java.util.List;
import java.util.Optional;

import Model.ContatoModel;
import Repository.JpaContatoRepository;

public abstract class DataSourcesImpl implements DataSources {

	JpaContatoRepository jpaContatoRepository;

	public DataSourcesImpl(JpaContatoRepository jpaContatoRepository) {
		super();
		this.jpaContatoRepository = jpaContatoRepository;
	}

 
	public void deletarContato(ContatoModel contatoModel) {
		jpaContatoRepository.delete(contatoModel);
	}
	public void adicionarContato(ContatoModel contatoModel) {
		jpaContatoRepository.save(contatoModel);
	}

	@Override
	public ContatoModel getById(long id) {
		Optional<ContatoModel> op = jpaContatoRepository.findById((id));

		return op.get();
	}

	@Override
	public List<ContatoModel> getContatos() {
		return jpaContatoRepository.findAll();
	}

}
