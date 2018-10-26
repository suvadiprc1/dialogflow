package com.example.demoaws.dtos;

import java.io.Serializable;
import java.util.List;

public class Card implements Serializable {

	private String title;
	private String subtitle;
	private String imageUri;
	private List<Buttons> buttons;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public List<Buttons> getButtons() {
		return buttons;
	}

	public void setButtons(List<Buttons> buttons) {
		this.buttons = buttons;
	}

}
