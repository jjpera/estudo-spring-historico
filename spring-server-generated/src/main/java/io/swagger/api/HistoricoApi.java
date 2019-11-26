/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.constants.Sistema;
import io.swagger.constants.TipoHistorico;
import io.swagger.model.Historico;
import io.swagger.model.RetornoHistorico;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-25T19:47:13.732Z[GMT]")
@Api(value = "historico", description = "the historico API")
public interface HistoricoApi {

	@ApiOperation(value = "Altera Historico", nickname = "alterarHistorico", notes = "Altera o valor do Historico existente.", response = RetornoHistorico.class, tags = {
			"Historico", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Alteração efeturada com sucesso!", response = RetornoHistorico.class),
			@ApiResponse(code = 500, message = "Erro no servidor.", response = RetornoHistorico.class) })
	@RequestMapping(value = "/historico/{codigo}", produces = { "application/json" }, method = RequestMethod.PUT)
	ResponseEntity<RetornoHistorico> alterarHistorico(
			@ApiParam(value = "", required = true) @PathVariable("codigo") String codigo,
			@ApiParam(value = "", required = true) @Valid @RequestBody Historico body);

	@ApiOperation(value = "Busca Historicos", nickname = "buscarHistorico", notes = "Busca historicos.", response = RetornoHistorico.class, tags = {
			"Historico", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Historico cadastrado com sucesso!", response = RetornoHistorico.class),
			@ApiResponse(code = 500, message = "Erro no servidor.", response = RetornoHistorico.class) })
	@RequestMapping(value = "/historico", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<RetornoHistorico> buscarHistorico(
			@ApiParam(value = "") @Valid @RequestParam(value = "tipoHistorico", required = true) TipoHistorico tipoHistorico,
			@ApiParam(value = "") @Valid @RequestParam(value = "sistema", required = true) Sistema sistema,
			@ApiParam(value = "") @Valid @RequestParam(value = "pagina", required = true) Integer pagina,
			@ApiParam(value = "") @Valid @RequestParam(value = "qtdePagina", required = true) Integer qtdePagina);

	@ApiOperation(value = "Cadastra Historico", nickname = "cadastrarHistorico", notes = "Cadastra um historico.", response = RetornoHistorico.class, tags = {
			"Historico", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Historico cadastrado com sucesso!", response = RetornoHistorico.class),
			@ApiResponse(code = 500, message = "Erro no servidor.", response = RetornoHistorico.class) })
	@RequestMapping(value = "/historico", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<RetornoHistorico> cadastrarHistorico(
			@ApiParam(value = "", required = true) @Valid @RequestBody Historico body);

	@ApiOperation(value = "Exclui o historico", nickname = "excluirHistorico", notes = "Exclui o historico existente.", response = RetornoHistorico.class, tags = {
			"Historico", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Exclusão efetuada com sucesso", response = RetornoHistorico.class),
			@ApiResponse(code = 500, message = "Erro no servidor", response = RetornoHistorico.class) })
	@RequestMapping(value = "/historico/{codigo}", produces = { "application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<RetornoHistorico> excluirHistorico(
			@ApiParam(value = "", required = true) @PathVariable("codigo") String codigo);

}
