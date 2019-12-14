package com.codewardev;

// https://www.codewars.com/kata/sort-the-odd/train/java


public class Kata {

	public static int[] sortArray(int[] array) {
		int[] result = array;
		for(int i=0; i<result.length; i++) {
			if(result[i]%2 != 0 && result[i] != 0) {
				for(int j=i+1; j<result.length;j++) {
					if(result[j]%2 != 0 && result[j] != 0) {
						if(result[j] < result[i]) {
							int temp = result[i];
							result[i] = result[j];
							result[j] = temp;
						}
					}
				}
			}
		}
		System.out.println("This set...");
		for(int a: result)
			System.out.println("a: "+a);
		return result;
	}

}
