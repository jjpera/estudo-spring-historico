package io.swagger.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.constants.Sistema;
import io.swagger.constants.TipoHistorico;

/**
 * Historico
 */
@Document(collection = "historico")
public class Historico {

	@Id
	@JsonProperty("id")
	private String id;

	@JsonProperty("data")
	private OffsetDateTime data;

	@JsonProperty("tipo")
	private TipoHistorico tipo;

	@JsonProperty("sistema")
	private Sistema sistema;

	@JsonProperty("descricao")
	private String descricao;

	public Historico id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(example = "234", value = "")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Historico data(OffsetDateTime data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 * 
	 * @return data
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OffsetDateTime getData() {
		return data;
	}

	public void setData(OffsetDateTime data) {
		this.data = data;
	}

	public Historico tipo(TipoHistorico tipo) {
		this.tipo = tipo;
		return this;
	}

	/**
	 * Get tipo
	 * 
	 * @return tipo
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public TipoHistorico getTipo() {
		return tipo;
	}

	public void setTipo(TipoHistorico tipo) {
		this.tipo = tipo;
	}

	public Historico sistema(Sistema sistema) {
		this.sistema = sistema;
		return this;
	}

	/**
	 * Get sistema
	 * 
	 * @return sistema
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Historico descricao(String descricao) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Historico historico = (Historico) o;
		return Objects.equals(this.id, historico.id) && Objects.equals(this.data, historico.data)
				&& Objects.equals(this.tipo, historico.tipo) && Objects.equals(this.sistema, historico.sistema)
				&& Objects.equals(this.descricao, historico.descricao);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, data, tipo, sistema, descricao);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Historico {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    data: ").append(toIndentedString(data)).append("\n");
		sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
		sb.append("    sistema: ").append(toIndentedString(sistema)).append("\n");
		sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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
