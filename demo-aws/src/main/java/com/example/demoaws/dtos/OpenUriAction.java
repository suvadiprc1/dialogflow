package com.example.demoaws.dtos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class OpenUriAction implements Serializable {

	private String uri;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
