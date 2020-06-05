package spoj;

import java.util.Scanner;

/***
 * print sum of reversed number in reversed form
 * 
 * @author vaibhav
 *
 */
public class ReverseNumberAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int[] numberOne = new int[testCases];
		int[] numberTwo = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			numberOne[i] = sc.nextInt();
			numberTwo[i] = sc.nextInt();
		}
		for (int i = 0; i < testCases; i++) {
			StringBuilder builderOne = new StringBuilder(String.valueOf(numberOne[i]));
			StringBuilder builderTwo = new StringBuilder(String.valueOf(numberTwo[i]));
			int sum = (Integer.valueOf(builderOne.reverse().toString())
					+ Integer.valueOf(builderTwo.reverse().toString()));
			System.out.println(Integer.valueOf(new StringBuilder(String.valueOf(sum)).reverse().toString()));
		}

		sc.close();
	}

}
