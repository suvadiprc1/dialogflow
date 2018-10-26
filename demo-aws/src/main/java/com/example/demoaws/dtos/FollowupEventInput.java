package com.example.demoaws.dtos;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("serial")
public class FollowupEventInput implements Serializable {

	private String name;
	private String languageCode;
	private Map<String, String> parameters;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

}
