package com.example.demoaws.dtos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Image implements Serializable {

	private String imageUri;
	private String accessibilityText;

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public String getAccessibilityText() {
		return accessibilityText;
	}

	public void setAccessibilityText(String accessibilityText) {
		this.accessibilityText = accessibilityText;
	}

}
