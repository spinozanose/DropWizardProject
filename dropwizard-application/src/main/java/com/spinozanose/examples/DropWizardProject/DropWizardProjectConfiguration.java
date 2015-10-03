package com.spinozanose.examples.DropWizardProject;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import io.dropwizard.Configuration;

//this is just using hibernate for validation because it is available.
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DropWizardProjectConfiguration extends Configuration {

	@Valid
	@NotNull
	private MessageQueueFactory messageQueue = new MessageQueueFactory();

	@NotEmpty
	private String template;

	@NotEmpty
	private String defaultName = "Stranger";

	@JsonProperty
	public String getTemplate() {
		return template;
	}

	@JsonProperty
	public void setTemplate(String template) {
		this.template = template;

	}

	@JsonProperty
	public String getDefaultName() {
		return defaultName;
	}

	@JsonProperty
	public void setDefaultName(String name) {
		this.defaultName = name;
	}

	@JsonProperty("messageQueue")
	public MessageQueueFactory getMessageQueueFactory() {
		return messageQueue;
	}

	@JsonProperty("messageQueue")
	public void setMessageQueueFactory(MessageQueueFactory factory) {
		this.messageQueue = factory;
	}
}
