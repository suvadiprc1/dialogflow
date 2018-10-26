package com.example.demoaws.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@SuppressWarnings("serial")
public class QueryResult implements Serializable {

	private String queryText;
	private Map<String, String> parameters;
	private Boolean allRequiredParamsPresent;
	private String fulfillmentText;
	private List<Texts> fulfillmentMessages;
	private List<OutputContexts> outputContexts;
	private Intent intent;
	private Number intentDetectionConfidence;
	private Object diagnosticInfo;
	private String languageCode;

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public Boolean getAllRequiredParamsPresent() {
		return allRequiredParamsPresent;
	}

	public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
		this.allRequiredParamsPresent = allRequiredParamsPresent;
	}

	public String getFulfillmentText() {
		return fulfillmentText;
	}

	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}

	public List<Texts> getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	public void setFulfillmentMessages(List<Texts> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	public List<OutputContexts> getOutputContexts() {
		return outputContexts;
	}

	public void setOutputContexts(List<OutputContexts> outputContexts) {
		this.outputContexts = outputContexts;
	}

	public Intent getIntent() {
		return intent;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	public Number getIntentDetectionConfidence() {
		return intentDetectionConfidence;
	}

	public void setIntentDetectionConfidence(Number intentDetectionConfidence) {
		this.intentDetectionConfidence = intentDetectionConfidence;
	}

	public Object getDiagnosticInfo() {
		return diagnosticInfo;
	}

	public void setDiagnosticInfo(Object diagnosticInfo) {
		this.diagnosticInfo = diagnosticInfo;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	@Override
	public String toString() {
		return "QueryResult [queryText=" + queryText + ", parameters=" + parameters + ", allRequiredParamsPresent="
				+ allRequiredParamsPresent + ", fulfillmentText=" + fulfillmentText + ", fulfillmentMessages="
				+ fulfillmentMessages + ", outputContexts=" + outputContexts + ", intent=" + intent
				+ ", intentDetectionConfidence=" + intentDetectionConfidence + ", diagnosticInfo=" + diagnosticInfo
				+ ", languageCode=" + languageCode + "]";
	}
	
	

}
