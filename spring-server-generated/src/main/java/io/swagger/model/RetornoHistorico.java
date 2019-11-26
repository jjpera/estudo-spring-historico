package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RetornoHistorico
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-25T19:47:13.732Z[GMT]")
public class RetornoHistorico extends Retorno {
	@JsonProperty("listaHistoricos")
	@Valid
	private List<Historico> listaHistoricos;

	public RetornoHistorico listaHistoricos(List<Historico> listaHistoricos) {
		this.listaHistoricos = listaHistoricos;
		return this;
	}

	public List<Historico> getListaHistoricos() {
		if (listaHistoricos == null) {
			listaHistoricos = new ArrayList<Historico>();
		}

		return listaHistoricos;
	}

	public void setListaHistoricos(List<Historico> listaHistoricos) {
		this.listaHistoricos = listaHistoricos;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RetornoHistorico retornoHistorico = (RetornoHistorico) o;
		return Objects.equals(this.listaHistoricos, retornoHistorico.listaHistoricos) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaHistoricos, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RetornoHistorico {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    listaHistoricos: ").append(toIndentedString(listaHistoricos)).append("\n");
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
