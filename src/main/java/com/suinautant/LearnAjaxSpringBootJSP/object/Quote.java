package com.suinautant.LearnAjaxSpringBootJSP.object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	private String type;
	private Value value;

	public Quote() {

	}

	@Override
	public String toString() {
		return "Quote {" + "type='" + type + "'}" + ", value="
				+value +  "}";
	}

}
