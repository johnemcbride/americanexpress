package com.americanexpress.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryData {



	private String status;
	private String messageType;
	private Card[] cardList;
	private UserData userData;
	
	
	public SummaryData() {
		super();
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	
	public Card[] getCardList() {
		return cardList;
	}


	public void setCardList(Card[] cardList) {
		this.cardList = cardList;
	}
	
	
	public UserData getUserData() {
		return userData;
	}
	public void setUserData(UserData userData) {
		this.userData = userData;
	}

}
