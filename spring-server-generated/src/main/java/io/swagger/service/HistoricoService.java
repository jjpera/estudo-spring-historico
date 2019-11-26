package io.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.threeten.bp.OffsetDateTime;

import io.swagger.constants.Sistema;
import io.swagger.constants.TipoHistorico;
import io.swagger.model.Historico;
import io.swagger.repository.HistoricoRepository;

@Service
public class HistoricoService {

	@Autowired
	private HistoricoRepository historicoRepository;

	public void save(Historico historico) {
		historico.setData(OffsetDateTime.now());
		historicoRepository.save(historico);
	}

	public List<Historico> findAll(Sistema sistema, TipoHistorico tipo, Integer pagina, Integer qtdePagina) {

		return historicoRepository.find(sistema, tipo, new PageRequest(pagina, qtdePagina, Direction.DESC, "data"));
	}

	public long count(Sistema sistema, TipoHistorico tipo) {
		return historicoRepository.count();
	}

	public Historico findById(String id) {
		return historicoRepository.findOne(id);
	}

	public void delete(String id) {
		historicoRepository.delete(id);
	}
}
