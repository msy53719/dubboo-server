package com.mock.server.service;

import com.mock.server.core.domain.CaseInfo;

public interface CaseService {

	public abstract void queryCase(int id, String name);

	public abstract void addCase(CaseInfo caseInfo);

	public abstract void modifyCase(CaseInfo caseInfo);
}
