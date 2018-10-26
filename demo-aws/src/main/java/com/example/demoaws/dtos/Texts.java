package com.example.demoaws.dtos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Texts implements Serializable {

	private Text text;

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Texts [text=" + text + "]";
	}
	
	

}
