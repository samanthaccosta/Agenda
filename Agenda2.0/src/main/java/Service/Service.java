package Service;

import java.util.List;
import java.util.stream.Collectors;

import Entity.Contato;
import Model.ContatoModel;


public class Service {

	//Atribui os dados da model para a entity
	public static Contato toContato(ContatoModel contatoModel) {
		Contato contatos = new Contato();
		contatos.setEmail(contatoModel.getEmail());
		contatos.setNome(contatoModel.getNome());
		contatos.setTelefone(contatoModel.getTelefone()); 
		contatos.setId(contatoModel.getId());
		return contatos;
		 
	}
	public ContatoModel toContatoModel(Contato contato) {
		ContatoModel model = new ContatoModel();
		model.setId(contato.getId());
		model.setEmail(contato.getEmail());
		model.setNome(contato.getNome());
		model.setTelefone(contato.getTelefone()); 
		return model;
		 
	}
	public List<Contato> toListaContato(List<ContatoModel> contatoModel){		
		return contatoModel.stream().map(temp -> {
			Contato obj = new Contato();
			obj.setId(temp.getId());
			obj.setEmail(temp.getEmail());
			obj.setNome(temp.getNome());
			obj.setTelefone(temp.getTelefone());
			return obj;
	
}).collect(Collectors.toList());
		}
}
