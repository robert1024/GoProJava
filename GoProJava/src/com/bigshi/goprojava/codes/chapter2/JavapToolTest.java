package com.bigshi.goprojava.codes.chapter2;

public class JavapToolTest {
	int count = 20;
	{
		count  = 12;
	}
	public JavapToolTest(){
		System.out.println(count);
	}
	public JavapToolTest(String name){
		System.out.println(name);
	}
}
