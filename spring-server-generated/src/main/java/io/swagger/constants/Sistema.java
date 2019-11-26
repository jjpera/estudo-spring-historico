package io.swagger.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Sistema {
	LINHA("linha"), BANDA("banda"), TV("tv"), HISTORICO("historico");

	private String value;

	Sistema(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static Sistema fromValue(String text) {
		for (Sistema b : Sistema.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
