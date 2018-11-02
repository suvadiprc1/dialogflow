package com.example.demoaws.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoaws.dtos.DialogFlowRQ;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2EventInput;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookResponse;

@RestController
public class DialogFlowController {

	@Resource
	private Map<String, List<String>> models;

	@PostMapping("/hi")
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

	@PostMapping("service")
	public GoogleCloudDialogflowV2WebhookResponse serviceCar(@RequestBody DialogFlowRQ dialogFlowRQ) {
		System.out.println("inside car service controller");
		final Map<String, Object> parameters = dialogFlowRQ.getQueryResult().getParameters();
		parameters.keySet().stream().forEach(k -> System.out.println("key = " + k + " value = " + parameters.get(k)));
		final GoogleCloudDialogflowV2WebhookResponse response = new GoogleCloudDialogflowV2WebhookResponse();
		final GoogleCloudDialogflowV2EventInput eventInput = new GoogleCloudDialogflowV2EventInput();
		if (models.containsKey(parameters.get("make"))) {
			eventInput.setName("confirmation");
			final Map<String, Object> params = new HashMap<>();
			params.put("name", parameters.get("name"));
			params.put("city", parameters.get("city"));
			params.put("make", parameters.get("make"));
			params.put("model", parameters.get("model"));
			params.put("datetime", parameters.get("date_time"));
			eventInput.setParameters(params);
			response.setFollowupEventInput(eventInput);
		} else {
			eventInput.setName("error");
			final Map<String, Object> params = new HashMap<>();
			params.put("name", parameters.get("name"));
			params.put("city", parameters.get("city"));
			params.put("make", parameters.get("make"));
			params.put("model", parameters.get("model"));
			params.put("datetime", parameters.get("date_time"));
			eventInput.setParameters(params);
			response.setFollowupEventInput(eventInput);
		}

		return response;
	}

}
