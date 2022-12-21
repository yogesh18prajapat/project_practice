package com.bat.practice;

//Given an Integer N returns the smallest integer greater than N whose sum should be twice as big as the sum of N.
//1. if N is 11, then the next smallest number which is greater than N,whose sum should be twice as big as 2.(1+1=2)

public class Solution {
	public int solution(int N) {
		if(N<10) {
			return 0;
		}
		
		String[] splitN = String.valueOf(N).split("");
		int sumOfN = 0;
		for(String digit : splitN) {
			sumOfN += Integer.valueOf(digit);
		}
		int totalSumOfN = sumOfN * 2;
		int solution = N;
		while(true) {
			int solutionSum = 0;
			solution =solution +1;
			String[] SolutionArray = String.valueOf(solution).split("");
			for(String digit : SolutionArray) {
				solutionSum += Integer.valueOf(digit);
			}
			if(solutionSum == totalSumOfN) {
				break;
			}
		}
		return solution;
	}
}
