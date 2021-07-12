package com.devsuperior.bds04.controllers.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();

	public List<FieldMessage> getErros() {
		return errors;
	}
	
	public void addError (String fieldMessage, String message) {
		errors.add(new FieldMessage(fieldMessage, message));
	}

}
