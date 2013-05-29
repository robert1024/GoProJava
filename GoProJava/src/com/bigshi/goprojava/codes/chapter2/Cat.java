package com.bigshi.goprojava.codes.chapter2;

public class Cat {
	//first allocate memory for name, age, wegiht.
	//go down to where values are assigned in turn.
	String name="b";
	int age;
	public Cat(String name,int age) {
		System.out.println("Execute the constuctor1");
		this.name = name;
		this.age = age;
	}
	{
		//executed before constructor.
		System.out.println("Execute non-static init block");
		weight = 2.0;
	}
	double weight = 2.3;
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight
				+ "]";
	}
}
