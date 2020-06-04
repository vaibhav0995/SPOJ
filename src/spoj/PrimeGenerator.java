package spoj;

import java.util.Scanner;

/***
 * generate prime numbers between given two numbers
 * 
 * @author vaibhav
 *
 */
public class PrimeGenerator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int[] a = new int[testCases];
		int[] b = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			while (j <= b[i]) {
				boolean tempFlag = false;
				for (int k = 2; k <= Math.sqrt(j); k++) {
					if (j % k == 0) {
						tempFlag = true;
						break;
					}
				}
				if (!tempFlag) {
					System.out.println(j);
				}
				
				j++;
			}
			System.out.println();
		}
		
		sc.close();
	}
}
