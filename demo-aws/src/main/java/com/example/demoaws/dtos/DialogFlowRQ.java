package com.example.demoaws.dtos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DialogFlowRQ implements Serializable {

	private String responseId;
	private String session;
	private QueryResult queryResult;

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public QueryResult getQueryResult() {
		return queryResult;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	@Override
	public String toString() {
		return "DialogFlowRQ [responseId=" + responseId + ", session=" + session + ", queryResult=" + queryResult + "]";
	}
	
	

}
