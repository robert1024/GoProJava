package com.bigshi.goprojava.codes.chapter1;

public class ArrayTest3 {
	public static void main(String[] args) {
		//define and init array nums
		int[] nums = new int[]{3,5,20,12};
		//define a prices array
		int[] prices;
		prices = nums;
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		prices[2] = 34;
		System.out.println("The 3rd element of nums: "+nums[2]);
	}
}
