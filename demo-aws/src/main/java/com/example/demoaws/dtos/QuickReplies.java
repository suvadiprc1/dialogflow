package com.example.demoaws.dtos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class QuickReplies implements Serializable {

	private String title;
	private QuickrepliesValues quickReplies;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public QuickrepliesValues getQuickReplies() {
		return quickReplies;
	}

	public void setQuickReplies(QuickrepliesValues quickReplies) {
		this.quickReplies = quickReplies;
	}

}
