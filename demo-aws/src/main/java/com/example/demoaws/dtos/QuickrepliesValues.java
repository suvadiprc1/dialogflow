package com.example.demoaws.dtos;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class QuickrepliesValues implements Serializable {

	private List<String> quickReplies;

	public List<String> getQuickReplies() {
		return quickReplies;
	}

	public void setQuickReplies(List<String> quickReplies) {
		this.quickReplies = quickReplies;
	}

}
