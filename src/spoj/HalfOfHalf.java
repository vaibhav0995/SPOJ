package spoj;

import java.util.Scanner;

/***
 * Print second character of second half of String
 * 
 * @author vaibhav
 *
 */
public class HalfOfHalf {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		String[] inputStringarr = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			inputStringarr[i] = sc.next();
		}

		for (int i = 0; i < testCases; i++) {
			String tempVar = inputStringarr[i];
			tempVar = tempVar.substring(0, (tempVar.length() / 2));
			int j = 0;
			do {
				System.out.print(tempVar.charAt(j));
				j += 2;
			} while (j >= 0 && j < tempVar.length());
			
			System.out.println();
		}

		sc.close();
	}
}
