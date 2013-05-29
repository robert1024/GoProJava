package com.bigshi.goprojava.codes.chapter2;

public class Price {
	final static Price INSTANCE = new Price(2.8);
	
	static double initPrice = 20;
	double currentPrice;
	public Price(double discount){
		currentPrice = initPrice - discount;
	}
}
