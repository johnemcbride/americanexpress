package com.americanexpress.api.model;

public class LogonData {
	
	private String status;
	private String messageType;
	private String gateKeeperCookie;
	private String cupcake;
	private String publicGuid;
	
	
	public LogonData() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getGateKeeperCookie() {
		return gateKeeperCookie;
	}
	public void setGateKeeperCookie(String gateKeeperCookie) {
		this.gateKeeperCookie = gateKeeperCookie;
	}
	public String getCupcake() {
		return cupcake;
	}
	public void setCupcake(String cupcake) {
		this.cupcake = cupcake;
	}
	public String getPublicGuid() {
		return publicGuid;
	}
	public void setPublicGuid(String publicGuid) {
		this.publicGuid = publicGuid;
	}
	
	
	

}
