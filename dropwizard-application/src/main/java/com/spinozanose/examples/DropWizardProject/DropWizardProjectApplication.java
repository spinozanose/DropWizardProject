package com.spinozanose.examples.DropWizardProject;

import com.spinozanose.examples.DropWizardProject.core.MessageQueueClient;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class DropWizardProjectApplication extends Application<DropWizardProjectConfiguration> {

	public static void main(String[] args) throws Exception {
		new DropWizardProjectApplication().run(args);
	}
	
	@Override
	public void run(DropWizardProjectConfiguration configuration,
			Environment environment) throws Exception {
		MessageQueueClient messageQueue = configuration.getMessageQueueFactory().build(environment);
	}

	
}
