package com.bizruntime.Online_Order_Delivery_Time;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;

@ProcessApplication("Order Approval App")
public class OnlineOrderApplication extends ServletProcessApplication {
	private static final String PROCESS_DEFINITION_KEY = "approveOrder";

	  @PostDeploy
	  public void onDeploymentFinished(ProcessEngine processEngine) {

	  }
}