package com.bigshi.goprojava.codes.chapter2;

public class PriceTest {
	public static void main(String[] args) {
		System.out.println(Price.INSTANCE.currentPrice);
		Price p = new Price(2.8);
		System.out.println(p.currentPrice);
	}
}
