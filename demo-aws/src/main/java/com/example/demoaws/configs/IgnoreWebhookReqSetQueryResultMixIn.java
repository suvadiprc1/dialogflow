package com.example.demoaws.configs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.cloud.dialogflow.v2.WebhookRequest.Builder;

public abstract class IgnoreWebhookReqSetQueryResultMixIn {
	
	@JsonIgnore public abstract Builder setQueryResult(
	        com.google.cloud.dialogflow.v2.QueryResult.Builder builderForValue);

}
