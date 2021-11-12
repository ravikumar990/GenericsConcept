package com.genericcode;

public class MaximumNumber {

	public static void main(String[] args) {
		Integer[] intArr = { 19, 1339, 999, 995 };
		Float[] floatArr = { 15.55f, 14.65f, 15.22f };
		String[] strArr = { "RAMESH", "Ramesh", "ramesh" };

		// call generic method
		findMax(intArr);
		findMax(floatArr);
		findMax(strArr);
	}

	public static <E extends Comparable<E>> void findMax(E[] arr) {

		E maximum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maximum.compareTo(arr[i]) < 0) {
				maximum = arr[i];
			}
		}
		System.out.println("maximum is " + maximum);
	}
}