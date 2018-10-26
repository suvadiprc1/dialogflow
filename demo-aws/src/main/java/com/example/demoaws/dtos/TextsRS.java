package com.example.demoaws.dtos;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class TextsRS implements Serializable {

	private List<String> text;

	public List<String> getText() {
		return text;
	}

	public void setText(List<String> text) {
		this.text = text;
	}

}
