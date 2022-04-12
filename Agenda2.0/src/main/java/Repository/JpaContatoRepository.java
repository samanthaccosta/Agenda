package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.ContatoModel;

public interface JpaContatoRepository extends JpaRepository<ContatoModel, Long> {

}
