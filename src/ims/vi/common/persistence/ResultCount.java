/**
 * This software is the confidential and proprietary information of
 * CASCADE(Confidential Information). You shall no
 * disclose such Confidential Information and shall use it only in
 * Copyright 2008 CASCADE. All Rights Reserved.
 * Accordance with the terms of the license agreement you entered into 
 * With CASCADE
 * Creation Date 9/May/2008
 * 
 */
package ims.vi.common.persistence;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
/**
 * A value class that wraps the information of sql return results.
 * 
 * @author Ben CP Chan ben.cp.chan@pccw.com
 * 
 */
public class ResultCount implements Serializable {
	private static final long serialVersionUID = 1L;
	//start index of the result
	private final int firstResult;
	//maximum result returned
	private final int maxResult;

	public ResultCount(int firstResult, int maxResult) {
		this.firstResult = firstResult;
		this.maxResult = maxResult;
	}

	public ResultCount() {
		this(0,0);
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return EqualsBuilder.reflectionEquals(this, arg0);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public int getFirstResult() {
		return firstResult;
	}

	public int getMaxResult() {
		return maxResult;
	}
}