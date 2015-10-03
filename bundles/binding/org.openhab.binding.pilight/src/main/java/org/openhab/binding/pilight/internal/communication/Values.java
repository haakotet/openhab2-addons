/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.pilight.internal.communication;

/**
 * Describes the specific properties of a device
 * 
 * @author Jeroen Idserda
 * @since 1.0
 */
public class Values {

	private Integer dimlevel;
	
	public Integer getDimlevel() {
		return dimlevel;
	}

	public void setDimlevel(Integer dimlevel) {
		this.dimlevel = dimlevel;
	}
	
}