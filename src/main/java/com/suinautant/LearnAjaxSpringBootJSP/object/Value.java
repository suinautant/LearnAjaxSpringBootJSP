package com.suinautant.LearnAjaxSpringBootJSP.object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

	private Long id;
	private String quote;

	public Value() {
	}

	@Override
	public String toString() {
		return "Value{" + "id=" + id + ", quote='" + quote + "\'" + "}";
	}

}
