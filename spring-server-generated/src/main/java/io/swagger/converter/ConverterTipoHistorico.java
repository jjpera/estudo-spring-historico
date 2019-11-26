package io.swagger.converter;

import java.beans.PropertyEditorSupport;

import io.swagger.constants.TipoHistorico;

public class ConverterTipoHistorico extends PropertyEditorSupport {

	public void setAsText(final String text) throws IllegalArgumentException {
		setValue(TipoHistorico.fromValue(text));
	}
}
