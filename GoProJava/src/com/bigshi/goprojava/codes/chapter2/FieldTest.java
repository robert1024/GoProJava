package com.bigshi.goprojava.codes.chapter2;

/**
 * @author RobertShi
 *	get instance of Person class:
 *			- Person.class
 *			- Class.forName("Person");
 */
public class FieldTest {
	public static void main(String[] args) {
		Person.eyeNum = 2;
		System.out.println("eyeNum: "+Person.eyeNum);
		Person p = new Person();
		p.name = "Alice";
		p.age = 30;
		System.out.println("p.eyeNum: "+p.eyeNum);
		p.info();
		Person p2 = new Person();
		p2.name="Robert";
		p2.age=30;
		p2.info();
		p2.eyeNum =3;
		System.out.println("p.eyeNum: "+p.eyeNum);
		System.out.println("p2.eyeNum: "+p2.eyeNum);
		System.out.println("Person.eyeNum: "+Person.eyeNum);
	}
}
