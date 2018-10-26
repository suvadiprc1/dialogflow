package com.example.demoaws.dtos;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("serial")
public class Payload implements Serializable {

	private Map<String, PayloadValue> payload;

	public Map<String, PayloadValue> getPayload() {
		return payload;
	}

	public void setPayload(Map<String, PayloadValue> payload) {
		this.payload = payload;
	}

}
