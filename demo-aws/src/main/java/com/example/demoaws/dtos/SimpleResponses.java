package com.example.demoaws.dtos;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class SimpleResponses implements Serializable {

	private List<SimpleResponse> simpleResponses;

	public List<SimpleResponse> getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(List<SimpleResponse> simpleResponses) {
		this.simpleResponses = simpleResponses;
	}

}
