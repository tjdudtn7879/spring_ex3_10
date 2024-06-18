package com.lgy.springex_3_10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainCapital {
	public static void main(String[] args) {
		String configLoc="classpath:capitalCTX.xml";
		AbstractApplicationContext ctx= new GenericXmlApplicationContext(configLoc);
		MyCapital myEvenNumber=ctx.getBean("myCapital",MyCapital.class);
		
		myEvenNumber.alpha();
	}
}
