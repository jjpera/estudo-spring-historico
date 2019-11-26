package io.swagger.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Retorno
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-25T19:47:13.732Z[GMT]")
public class Retorno {
	@JsonProperty("codigo")
	private Long codigo;

	@JsonProperty("descricao")
	private String descricao;

	@JsonProperty("registros")
	private Long registros;

	@JsonProperty("pagina")
	private Integer pagina;

	@JsonProperty("qtdePagina")
	private Integer qtdePagina;

	public Retorno codigo(Long codigo) {
		this.codigo = codigo;
		return this;
	}

	/**
	 * Get codigo
	 * 
	 * @return codigo
	 **/
	@ApiModelProperty(example = "234", value = "")

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Retorno descricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	/**
	 * Get descricao
	 * 
	 * @return descricao
	 **/
	@ApiModelProperty(value = "")

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Retorno registros(Long registros) {
		this.registros = registros;
		return this;
	}

	/**
	 * Get registros
	 * 
	 * @return registros
	 **/
	@ApiModelProperty(value = "")

	public Long getRegistros() {
		return registros;
	}

	public void setRegistros(Long registros) {
		this.registros = registros;
	}

	public Retorno pagina(Integer pagina) {
		this.pagina = pagina;
		return this;
	}

	/**
	 * Get pagina
	 * 
	 * @return pagina
	 **/
	@ApiModelProperty(value = "")

	public Integer getPagina() {
		return pagina;
	}

	public void setPagina(Integer pagina) {
		this.pagina = pagina;
	}

	public Retorno qtdePagina(Integer qtdePagina) {
		this.qtdePagina = qtdePagina;
		return this;
	}

	/**
	 * Get qtdePagina
	 * 
	 * @return qtdePagina
	 **/
	@ApiModelProperty(value = "")

	public Integer getQtdePagina() {
		return qtdePagina;
	}

	public void setQtdePagina(Integer qtdePagina) {
		this.qtdePagina = qtdePagina;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Retorno retorno = (Retorno) o;
		return Objects.equals(this.codigo, retorno.codigo) && Objects.equals(this.descricao, retorno.descricao)
				&& Objects.equals(this.registros, retorno.registros) && Objects.equals(this.pagina, retorno.pagina)
				&& Objects.equals(this.qtdePagina, retorno.qtdePagina);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, descricao, registros, pagina, qtdePagina);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Retorno {\n");

		sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
		sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
		sb.append("    registros: ").append(toIndentedString(registros)).append("\n");
		sb.append("    pagina: ").append(toIndentedString(pagina)).append("\n");
		sb.append("    qtdePagina: ").append(toIndentedString(qtdePagina)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
