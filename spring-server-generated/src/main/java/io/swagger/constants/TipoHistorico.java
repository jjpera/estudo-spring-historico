package io.swagger.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoHistorico {
	POST("post"), PUT("put"), DELETE("delete"), GET("get");

	private String value;

	TipoHistorico(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static TipoHistorico fromValue(String text) {
		for (TipoHistorico b : TipoHistorico.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
