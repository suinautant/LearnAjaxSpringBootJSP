package com.suinautant.LearnAjaxSpringBootJSP.object;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Hobby {
	
	private Integer idx;
	
	private String name;
	
	private String hobby;

	public Hobby(Integer idx, String name, String hobby) {
		this.idx = idx;
		this.name = name;
		this.hobby = hobby;
	}

}
