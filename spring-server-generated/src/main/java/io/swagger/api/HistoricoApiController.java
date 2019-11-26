package io.swagger.api;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiParam;
import io.swagger.constants.Sistema;
import io.swagger.constants.TipoHistorico;
import io.swagger.converter.ConverterSistema;
import io.swagger.converter.ConverterTipoHistorico;
import io.swagger.model.Historico;
import io.swagger.model.RetornoHistorico;
import io.swagger.service.HistoricoService;


@Controller
public class HistoricoApiController implements HistoricoApi {

	private static final Logger log = LoggerFactory.getLogger(HistoricoApiController.class);

	@Autowired
	private HistoricoService historicoService;

	@InitBinder
	public void initBinder(final WebDataBinder webdataBinder) {
		webdataBinder.registerCustomEditor(Sistema.class, new ConverterSistema());
		webdataBinder.registerCustomEditor(TipoHistorico.class, new ConverterTipoHistorico());
	}
	
	public ResponseEntity<RetornoHistorico> alterarHistorico(
			@ApiParam(value = "", required = true) @PathVariable("codigo") String codigo,
			@ApiParam(value = "", required = true) @Valid @RequestBody Historico body) {

		RetornoHistorico retorno = new RetornoHistorico();

		try {
			Historico historico = historicoService.findById(codigo);
			if (historico == null) {
				throw new Exception("Historico nao encontrado");
			}

			body.setId(codigo);
			historicoService.save(body);
			retorno.getListaHistoricos().add(body);

			retorno.setCodigo(0L);
			retorno.setDescricao("SUCCESS");
		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			retorno.setCodigo(500L);
			retorno.setDescricao(e.getMessage());
		}

		return ResponseEntity.ok().body(retorno);
	}

	public ResponseEntity<RetornoHistorico> buscarHistorico(
			@ApiParam(value = "") @Valid @RequestParam(value = "tipoHistorico", required = true) TipoHistorico tipoHistorico,
			@ApiParam(value = "") @Valid @RequestParam(value = "sistema", required = true) Sistema sistema,
			@ApiParam(value = "") @Valid @RequestParam(value = "pagina", required = true) Integer pagina,
			@ApiParam(value = "") @Valid @RequestParam(value = "qtdePagina", required = true) Integer qtdePagina) {

		RetornoHistorico retorno = new RetornoHistorico();

		try {
			List<Historico> listaHistoricos = historicoService.findAll(sistema, tipoHistorico, pagina, qtdePagina);

			retorno.getListaHistoricos().addAll(listaHistoricos);
			retorno.setRegistros(historicoService.count(sistema, tipoHistorico));

			retorno.setCodigo(0L);
			retorno.setPagina(pagina);
			retorno.setQtdePagina(qtdePagina);
			retorno.setDescricao("SUCCESS");
		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			retorno.setCodigo(500L);
			retorno.setDescricao(e.getMessage());
		}
		
		return ResponseEntity.ok().body(retorno);
	}

	public ResponseEntity<RetornoHistorico> cadastrarHistorico(
			@ApiParam(value = "", required = true) @Valid @RequestBody Historico body) {

		RetornoHistorico retorno = new RetornoHistorico();

		try {
			if (body.getId() != null) {
				throw new Exception("Id não pode estar preenchido");
			}

			historicoService.save(body);
			retorno.getListaHistoricos().add(body);

			retorno.setCodigo(0L);
			retorno.setDescricao("SUCCESS");
		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			retorno.setCodigo(500L);
			retorno.setDescricao(e.getMessage());
		}

		return ResponseEntity.ok().body(retorno);
	}

	public ResponseEntity<RetornoHistorico> excluirHistorico(
			@ApiParam(value = "", required = true) @PathVariable("codigo") String codigo) {

		RetornoHistorico retorno = new RetornoHistorico();

		try {
			Historico historico = historicoService.findById(codigo);
			if (historico == null) {
				throw new Exception("Historico nao encontrado");
			}

			historicoService.delete(codigo);
			retorno.getListaHistoricos().add(historico);

			retorno.setCodigo(0L);
			retorno.setDescricao("SUCCESS");
		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			retorno.setCodigo(500L);
			retorno.setDescricao(e.getMessage());
		}

		return ResponseEntity.ok().body(retorno);
	}

}
