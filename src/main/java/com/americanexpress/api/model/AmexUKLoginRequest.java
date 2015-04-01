package com.americanexpress.api.model;

import java.util.Date;

public class AmexUKLoginRequest {

	private static String locale = "en_GB";
	private static String face = "en_GB";
	private static String userAgent = "Amex%20UK/3.0 CFNetwork/711.1.16 Darwin/14.0.0";
	private static String clientVersion = "3.0";
	private static String osBuild = "iPhone OS 8.1.2";
	private static String oSversion = "8.1.2";
	private static String rememberMe = "false";
	private static String clientType = "iPhone";
	private static String deviceModel = "iPhone7.1";
	private static String hardwareId = "C0F0FB91-ED81-41C7-AE09-739D3079656B";
	private static String timeZoneOffsetInMilli = "0";
	private String user = "";
	private String password = "";
	
	
	public AmexUKLoginRequest() {
		
	}
	
	public AmexUKLoginRequest(String username, String password) {
		super();
		this.user = username;
		this.password = password;
	}

	public static String getoSversion() {
		return oSversion;
	}

	public static String getUserAgent() {
		return userAgent;
	}

	public static String getFace() {
		return face;
	}

	public String getUserTimeStampInMilli()
	{
		return String.valueOf(new Date().getTime());
	}

	public String getUser() {
		return user;
	}

	public void setUser(String username) {
		this.user = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocale() {
		return locale;
	}

	public String getClientVersion() {
		return clientVersion;
	}

	public String getOsBuild() {
		return osBuild;
	}

	public String getRememberMe() {
		return rememberMe;
	}

	public String getClientType() {
		return clientType;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public String getHardwareId() {
		return hardwareId;
	}

	public static String getTimeZoneOffsetInMilli() {
		return timeZoneOffsetInMilli;
	}

}
