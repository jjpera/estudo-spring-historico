package io.swagger.converter;

import java.beans.PropertyEditorSupport;

import io.swagger.constants.Sistema;

public class ConverterSistema extends PropertyEditorSupport {

	public void setAsText(final String text) throws IllegalArgumentException {
		setValue(Sistema.fromValue(text));
	}

}
