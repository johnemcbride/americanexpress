package com.americanexpress.api.commandlineutils;


import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;

import com.americanexpress.api.client.AmexUKClient;

public class GetAmexBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.logging.Logger.getLogger("org.springframework.web.client.RestTemplate;").setLevel(Level.OFF);
		System.out.println(java.util.logging.Logger.getLogger("org.springframework.web.client.RestTemplate;").getLevel());
		java.util.logging.Logger.getLogger("o.s.web.client.RestTemplate").setLevel(Level.OFF);
	 	java.util.logging.Logger.getLogger("log4j.logger.httpclient.wire;").setLevel(Level.OFF);
	 	java.util.logging.Logger.getLogger("org.springframework.http.converter.json.MappingJackson2HttpMessageConverter").setLevel(Level.OFF);
	
	 	BigDecimal balance = new AmexUKClient(args[0], args[1])	.getLoginResp()
				.getSummaryData()
				.getCardList()[Integer.parseInt(args[2])]	
				.getSummary()	
				.getTotalBalance()
				.getMathematicalValue();
	 	
	 	PrintWriter writer;

	 	
	 	try {
	 		Date date = new Date();
	 		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			 writer = new PrintWriter(sdf.format(date)+"-balance-"+args[0]);
			 writer.print(balance);
			 writer.close();
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
	 	
	 	
	 	

	}

}
