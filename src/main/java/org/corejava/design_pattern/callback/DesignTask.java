package org.corejava.design_pattern.callback;

import org.apache.log4j.Logger;

public class DesignTask extends Task {
	
	Logger log = Logger.getLogger(DesignTask.class);

	@Override
	public void execute() {
		log.info("Executing the Design Task");
	}

}
