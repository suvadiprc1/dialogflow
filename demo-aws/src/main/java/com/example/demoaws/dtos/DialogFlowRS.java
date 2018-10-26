package com.example.demoaws.dtos;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class DialogFlowRS implements Serializable {

	private String fulfillmentText;
	private List<Card> fulfillmentMessages;
	private String source;
	private Payload payload;
	private List<OutputContexts> outputContexts;
	private FollowupEventInput followupEventInput;

	public String getFulfillmentText() {
		return fulfillmentText;
	}

	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}

	public List<Card> getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	public void setFulfillmentMessages(List<Card> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	public List<OutputContexts> getOutputContexts() {
		return outputContexts;
	}

	public void setOutputContexts(List<OutputContexts> outputContexts) {
		this.outputContexts = outputContexts;
	}

	public FollowupEventInput getFollowupEventInput() {
		return followupEventInput;
	}

	public void setFollowupEventInput(FollowupEventInput followupEventInput) {
		this.followupEventInput = followupEventInput;
	}

}
