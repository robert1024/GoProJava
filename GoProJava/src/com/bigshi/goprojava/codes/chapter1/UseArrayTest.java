package com.bigshi.goprojava.codes.chapter1;

public class UseArrayTest {
	public static void main(String[] args) {
		int[] pos = new int[5];
		for (int i = 0; i < pos.length; i++) {
			pos[i] = (i+1) *2;
		}
		int a = pos[1];
		int b = 20;
		pos[2] = b;
		Cat[] cats = new Cat[2];
		cats[0] = new Cat(3.35,2);
		cats[1] = new Cat(3.2, 2);
		Cat c1 = cats[0];
		Cat c2 = new Cat(4.3,2);
		cats[1] = c2;
	}
}
