package com.bigshi.goprojava.codes.chapter2;

public class StaticInitTest {
	static int count = 2;
	static{
		System.out.println("Static block!");
		name="robert";
	}
	static String name = "alice";
	public static void main(String[] args) {
		System.out.println("count: "+StaticInitTest.count);
		System.out.println("name: "+StaticInitTest.name);
	}
}
