package com.suinautant.LearnAjaxSpringBootJSP.object;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Post {
	
	private Integer PostId;
	
	private String NickName;
	
	private String Title;

	public Post(Integer postid, String nickName, String title) {
		PostId = postid;
		NickName = nickName;
		Title = title;
	}

}
