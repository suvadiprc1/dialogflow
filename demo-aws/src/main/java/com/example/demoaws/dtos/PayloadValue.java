package com.example.demoaws.dtos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PayloadValue implements Serializable {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
