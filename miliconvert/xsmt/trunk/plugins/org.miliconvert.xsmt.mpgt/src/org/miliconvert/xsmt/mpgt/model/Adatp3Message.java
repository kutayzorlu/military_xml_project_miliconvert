package org.miliconvert.xsmt.mpgt.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author matthieu
 *
 */
public class Adatp3Message extends AbstractAdatp3SetContainer{

	private String messageId;
	

	
	public Adatp3Message(String messageId) {
		super();
		this.messageId = messageId;
	}


	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	
	
}
