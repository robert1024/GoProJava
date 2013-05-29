package com.bigshi.goprojava.codes.chapter1;

/**
 * @author syh
 *	statically init array
 */
public class ArrayTest {
	
	 public static void main(String[] args) {
		//statically init array
		String[] books = new String[]{
							"book1",
							"book2",
							"book3",
							"book4"
						};
		//statically init array
		String[] names = {
							"Alice",
							"Robert",
							"Tom"
						};	
		//dynamically init array
		String[] strArr = new String[5];
		
		System.out.println("books length: "+books.length);
		System.out.println("names length: "+names.length);
		System.out.println("strArr length: "+strArr.length);
		
		books = names;
		strArr = names;
		System.out.println("books length: "+books.length);
		System.out.println("strArr length: "+strArr.length);
		books[1] = "Lily";
		System.out.println(books[1]);
	 }
	
}
