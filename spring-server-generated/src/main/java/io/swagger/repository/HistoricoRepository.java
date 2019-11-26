package io.swagger.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import io.swagger.constants.Sistema;
import io.swagger.constants.TipoHistorico;
import io.swagger.model.Historico;

public interface HistoricoRepository extends MongoRepository<Historico, String>{

	@Query("{sistema : ?0, tipo : ?1}")
	public List<Historico> find(Sistema sistema, TipoHistorico tipo, Pageable pageable);

	@Query(value = "{sistema : ?0, tipo : ?1}", count = true)
	public Long count(Sistema sistema, TipoHistorico tipo);
}
