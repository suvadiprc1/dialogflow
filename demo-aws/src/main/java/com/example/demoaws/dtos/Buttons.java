package com.example.demoaws.dtos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Buttons implements Serializable {

	private String text;
	private String postback;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPostback() {
		return postback;
	}

	public void setPostback(String postback) {
		this.postback = postback;
	}

}
