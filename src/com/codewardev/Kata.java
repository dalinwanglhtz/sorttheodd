package com.codewardev;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/sort-the-odd/train/java


public class Kata {

	public static int[] sortArray(int[] array) {
		int[] result = array;
		IntStream.range(0, result.length).boxed().map(i->{
			if(result[i]%2 != 0 && result[i] != 0) {
				IntStream.range(i, result.length).boxed().map(j->{
					if(result[j]%2 != 0 && result[j] != 0 && result[j] < result[i]) {
						int temp = result[i];
						result[i] = result[j];
						result[j] = temp;
					}
					return j;
				}).toArray();
			}
			return i;
		}).toArray();

		return result;
	}

}
