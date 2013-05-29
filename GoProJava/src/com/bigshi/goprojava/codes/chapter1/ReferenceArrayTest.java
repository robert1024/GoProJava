package com.bigshi.goprojava.codes.chapter1;


/**
 * @author syh
 *
 *	main stack: students zhang lee
 *	heap:	students-> [0] [1] 
 *			lee-> [16] [169]
 *			zhang -> [15] [158]
 *			[0] -> zhang
 *			[1] -> lee
 */			
public class ReferenceArrayTest {
	
	public static void main(String[] args) {
		Person[] students;
		students = new Person[2];
		System.out.println("Length of students: "+ students.length);
		
		Person zhang = new Person();
		zhang.age = 15;
		zhang.height = 158;
		
		Person lee = new Person();
		lee.age = 16;
		lee.height = 169;
		
		students[0] = zhang;
		students[1] = lee;
		
		lee.info();
		students[1].info();
	}
}
