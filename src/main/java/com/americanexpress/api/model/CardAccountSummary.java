package com.americanexpress.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
public class CardAccountSummary {

	private FinancialLabelValuePair statementBalance;
	private FinancialLabelValuePair totalBalance;

	public CardAccountSummary() {
		super();
	}

	public FinancialLabelValuePair getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(FinancialLabelValuePair totalBalance) {
		this.totalBalance = totalBalance;
	}

	public FinancialLabelValuePair getStatementBalance() {
		return statementBalance;
	}

	public void setStatementBalance(FinancialLabelValuePair statementBalance) {
		this.statementBalance = statementBalance;
	}
	
	/*"statementBalance": {
"label": "Last statement balance",
"value": "£0.00"
},
"recentPayments": {
"label": "Recent payments and credits",
"value": "£0.00"
},
"recentCharges": {
"label": "Latest transactions",
"value": "£0.00"
},
"totalBalance": {
"label": "Total balance",
"value": "£0.00"
},
"paymentDue": {
"label": "Balance due",
"value": "£0.00"
},
"paymentDueDate": {
"label": "due on",
"value": "11 Feb 2015"
},
"paymentDueOnDate": {
"label": "on %@",
"value": "11 Feb"
},
"lastStmtBalanceClosingDate": {
"label": "Closing date",
"value": "14 Jan 2015"
},
"latestTransactionStartDate": {
"label": "Since",
"value": "15 Jan 2015"
}*/
	
	
}
