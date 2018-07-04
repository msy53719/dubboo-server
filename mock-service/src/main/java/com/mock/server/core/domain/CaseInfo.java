package com.mock.server.core.domain;

import java.io.Serializable;

public class CaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -218426100702721306L;
	/**
	 * 
	 */

	private int caseId;
	private String caseName;
	private String caseStatus;
	private String caseDes;

	public int getCaseId() {
		return caseId;
	}

	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}

	public String getCaseName() {
		return caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public String getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}

	public String getCaseDes() {
		return caseDes;
	}

	public void setCaseDes(String caseDes) {
		this.caseDes = caseDes;
	}

}
