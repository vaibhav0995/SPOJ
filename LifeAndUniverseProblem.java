package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/***
 * Take user input & stop when input is 42
 * 
 * @author vaibhav
 *
 */
public class LifeAndUniverseProblem {
	public static void main(String[] args) throws java.lang.Exception {
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputReader);
		int param = 0;
		do {
			param = Integer.parseInt(br.readLine());
		} while (param != 42);
		System.out.println("Program Terminated !");
	}
}
