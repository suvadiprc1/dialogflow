package com.example.demoaws.dtos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Intent implements Serializable {

	private String name;
	private String displayName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return "Intent [name=" + name + ", displayName=" + displayName + "]";
	}

}
