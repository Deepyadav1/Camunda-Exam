package com.bizruntime.Online_Order_Delivery_Time;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;
import java.util.logging.Logger;

public class ProcessRequestDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("Order-REQUESTS");
  
  public void execute(DelegateExecution execution) throws Exception {
	  
	  boolean b1 = false;
	  	Integer Membership = (Integer) execution.getVariable("Membership") ;
	  	if (Membership == 1)
	  		{
	  		LOGGER.info("\n=========  Premuim Membership one day Delivery  =========================");
	  			b1 = true;
	  		
	  		}
	  	else
	  	{
	  	  	LOGGER.info("\n ========================  Not Premuim Membership standard (5 to 7 days) Delivery  ======================");
	  	     b1 = false;
	  	}
			
			execution.setVariable("PremuimMembership", b1);
			
			LOGGER.info("\n-----------------------------------------------");
			LOGGER.info("\nDeep Yadav Testing " + 
						"\n UserName : " + execution.getVariable("UserName") + 
						"\n Membership : " + execution.getVariable("Membership")  + 
							"\nCondition : "+ b1);
			if(b1)
			LOGGER.info("\n====================  Premuim Membership one day Delivery  =========================");
			else
			LOGGER.info("\n ========================  Not Premuim Membership standard (5 to 7 days) Delivery  ======================");
	  }
	}