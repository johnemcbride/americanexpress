package com.americanexpress.api.model;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FinancialLabelValuePair {

	private String label;
	private String value;
	
	public FinancialLabelValuePair() {
		super();
	}
	
	public BigDecimal getMathematicalValue() {

		BigDecimal balance = new BigDecimal(0);
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
		try {
			balance = BigDecimal.valueOf(nf.parse(value).doubleValue());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
		
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
