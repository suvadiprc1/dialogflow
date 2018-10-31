package com.example.demoaws.configs;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.cloud.dialogflow.v2.WebhookRequest;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		final ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.addMixIn(WebhookRequest.class, IgnoreWebhookReqSetQueryResultMixIn.class);
		final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(mapper);
		converters.add(converter);
	}

}
