package com.example.demoaws.dtos;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class Message implements Serializable {

	private List<String> text;
	private Image image;
	private QuickReplies quickReplies;
	private Card card;
	private SimpleResponse simpleResponses;
	private BasicCard basicCard;
	private OpenUriAction openUriAction;

	public List<String> getText() {
		return text;
	}

	public void setText(List<String> text) {
		this.text = text;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public QuickReplies getQuickReplies() {
		return quickReplies;
	}

	public void setQuickReplies(QuickReplies quickReplies) {
		this.quickReplies = quickReplies;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public SimpleResponse getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(SimpleResponse simpleResponses) {
		this.simpleResponses = simpleResponses;
	}

	public BasicCard getBasicCard() {
		return basicCard;
	}

	public void setBasicCard(BasicCard basicCard) {
		this.basicCard = basicCard;
	}

	public OpenUriAction getOpenUriAction() {
		return openUriAction;
	}

	public void setOpenUriAction(OpenUriAction openUriAction) {
		this.openUriAction = openUriAction;
	}

}