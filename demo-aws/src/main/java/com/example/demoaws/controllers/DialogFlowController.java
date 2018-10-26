package com.example.demoaws.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoaws.dtos.DialogFlowRQ;
import com.example.demoaws.dtos.DialogFlowRS;
import com.example.demoaws.dtos.Message;
import com.example.demoaws.dtos.OutputContexts;

@RestController
public class DialogFlowController {

	@PostMapping("hi")
	public DialogFlowRS hello(@RequestBody final DialogFlowRQ dialogFlowRQ) {
		System.out.println("Inside DialogflowController.hi()");
		System.out.println(dialogFlowRQ);
		final DialogFlowRS dialogFlowRS = new DialogFlowRS();
		dialogFlowRS.setFulfillmentText("Hello Suvadip RC! Nice to see you!! Please tell me your age.");
		final OutputContexts contexts = new OutputContexts();
		final Map<String, String> params = new HashMap<>();
		params.put("name", "Suvadip Roy Chowdhury");
		contexts.setLifespanCount(5);
		contexts.setName("contains-name");
		final List<OutputContexts> outputContexts = new ArrayList<>();
		outputContexts.add(contexts);
		dialogFlowRS.setOutputContexts(outputContexts);
		dialogFlowRS.setIntent(dialogFlowRQ.getQueryResult().getIntent());
		final Message message = new Message();
		final List<String> texts = new ArrayList<>();
		texts.add("Hey Suvadip RC! Nice to see you!! Please tell me your age.");
		message.setText(texts);
		final List<Message> messages = new ArrayList<>();
		messages.add(message);
		dialogFlowRS.setFulfillmentMessages(messages);
		return dialogFlowRS;
	}

}
