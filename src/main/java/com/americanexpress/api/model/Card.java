package com.americanexpress.api.model;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {
	
	private String homeCountryLocale;
	private String cardProductName;
	private Integer sortedIndex;
	private String cardKey;
	private String cardNumberDisplay;
	private URI cardArtImage;
	private CardAccountSummary summary;

	public Card() {
		super();
	}
	
	public String getHomeCountryLocale() {
		return homeCountryLocale;
	}
	public void setHomeCountryLocale(String homeCountryLocale) {
		this.homeCountryLocale = homeCountryLocale;
	}
	public String getCardProductName() {
		return cardProductName;
	}
	public void setCardProductName(String cardProductName) {
		this.cardProductName = cardProductName;
	}
	public Integer getSortedIndex() {
		return sortedIndex;
	}
	public void setSortedIndex(Integer sortedIndex) {
		this.sortedIndex = sortedIndex;
	}
	public String getCardKey() {
		return cardKey;
	}
	public void setCardKey(String cardKey) {
		this.cardKey = cardKey;
	}
	public String getCardNumberDisplay() {
		return cardNumberDisplay;
	}
	public void setCardNumberDisplay(String cardNumberDisplay) {
		this.cardNumberDisplay = cardNumberDisplay;
	}
	public URI getCardArtImage() {
		return cardArtImage;
	}
	public void setCardArtImage(URI cardArtImage) {
		this.cardArtImage = cardArtImage;
	}

	public CardAccountSummary getSummary() {
		return summary;
	}

	public void setSummary(CardAccountSummary summary) {
		this.summary = summary;
	}
	
	
	
	/*
	"homeCountryLocale": "en_GB",
	"cardProductName": "American Express Corporate Card   ",
	"sortedIndex": 1,
	"cardKey": "507DFA41B205B88DB1A4667E32910F404359E25C",
	"cardNumberDisplay": "XXX-11001",
	"cardArtImage": "https://secure.cmax.americanexpress.com/Internet/CardArt/EMEA/gb-cardasset-config/images/CGBCORGD0001S3.gif",
	"rewards": { … },
	"summary": { … },
	"capabilities": { … }
	*/

}
