package spoj;

import java.util.Scanner;

/***
 * Chess pattern using * & .
 * 
 * @author vaibhav
 *
 */
public class AsteriskPatternOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int[] rowCountArr = new int[testCases];
		int[] columnCountArr = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			rowCountArr[i] = sc.nextInt();
			columnCountArr[i] = sc.nextInt();
		}
		int k = 0;
		while (k < testCases) {
			for (int i = 0; i < rowCountArr[k]; i++) {
				char initialChar = (i % 2 == 0) ? '*' : '.';
				for (int j = 0; j < columnCountArr[k]; j++) {
					System.out.print(initialChar);
					initialChar = (initialChar == '*') ? '.' : '*';
				}
				System.out.println();
			}
			k++;

			System.out.println();
		}

		sc.close();
	}

}
