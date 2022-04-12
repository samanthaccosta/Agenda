package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Contato;
import Repository.JpaContatoRepository;
import Repository.RepositoryImpl;

@RestController
@RequestMapping("/contatos")
@CrossOrigin(origins ="*" , allowedHeaders = "*")
public class  ContatoController{
	@Autowired
	RepositoryImpl repositoryImpl;
	JpaContatoRepository jpaRepository;

	
	

	public ContatoController(RepositoryImpl repositoryImpl, JpaContatoRepository jpaRepository) {
		super();
		this.repositoryImpl = repositoryImpl;
		this.jpaRepository = jpaRepository;
	}



	@GetMapping
	public ResponseEntity<List<Contato>> getAll(){
		return ResponseEntity.ok(repositoryImpl.getContatos());
	}


}

