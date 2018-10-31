package com.example.demoaws.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoaws.dtos.DialogFlowRQ;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookResponse;

@RestController
public class DialogFlowController {

	@PostMapping("hi")
	public GoogleCloudDialogflowV2WebhookResponse hello(@RequestBody final DialogFlowRQ dialogFlowRQ) {
		System.out.println("Inside DialogflowController.hi()");
		System.out.println(dialogFlowRQ);
		final GoogleCloudDialogflowV2WebhookResponse response = new GoogleCloudDialogflowV2WebhookResponse();
		response.setFulfillmentText("Hello Suvadip RC!! Welcome to Dialogflow!!");
		/*final WebhookResponse response = WebhookResponse.newBuilder().setFulfillmentText("Hey Suvadip RC! Welcome!!").build();
		return response;*/
		
		
		/*final DialogFlowRS dialogFlowRS = new DialogFlowRS();
		dialogFlowRS.setFulfillmentText("Hello Suvadip RC! Nice to see you!! Please tell me your age.");
		final OutputContexts contexts = new OutputContexts();
		final Map<String, String> params = new HashMap<>();
		params.put("name", "Suvadip Roy Chowdhury");
		contexts.setLifespanCount(5);
		contexts.setName("contains-name");
		final List<OutputContexts> outputContexts = new ArrayList<>();
		outputContexts.add(contexts);
		dialogFlowRS.setOutputContexts(outputContexts);
		dialogFlowRS.setIntent(dialogFlowRQ.getQueryResult().getIntent());*/
		/*final Message message = new Message();
		final List<String> texts = new ArrayList<>();
		texts.add("Hey Suvadip RC! Nice to see you!! Please tell me your age.");
		final TextsRS text = new TextsRS();
		text.setText(texts);
		message.setText(text);
		final List<Message> messages = new ArrayList<>();
		messages.add(message);
		dialogFlowRS.setFulfillmentMessages(messages);*/
		return response;
	}

}
