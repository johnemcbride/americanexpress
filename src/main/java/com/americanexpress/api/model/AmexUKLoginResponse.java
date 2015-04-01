package com.americanexpress.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AmexUKLoginResponse {

	
	private String status = "";
	private LogonData logonData ;
	private SummaryData summaryData;
	
	
	public LogonData getLogonData() {
		return logonData;
	}


	public void setLogonData(LogonData logonData) {
		this.logonData = logonData;
	}


	public SummaryData getSummaryData() {
		return summaryData;
	}


	public void setSummaryData(SummaryData summaryData) {
		this.summaryData = summaryData;
	}


	
	
	public AmexUKLoginResponse() {
		
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
}
