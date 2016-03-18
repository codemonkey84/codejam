/**
 * 
 */
package com.codemonkey84.codejam.round1a2008;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author lenovo
 *
 */
public class ScalarProduct {

	private static long min;

	private static void findMin(Vector<Long> v1, Vector<Long> v2) {
		for (int i = 0; i < v1.size(); i++) {
			min += v1.get(i) * v2.get(i);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		Vector<Long> results = new Vector<>();
		for (int i = 0; i < testCases; i++) {
			int len = scanner.nextInt();
			Vector<Long> v1 = new Vector<>();
			for (int j = 0; j < len; j++) {
				v1.add(j, scanner.nextLong());
			}
			Vector<Long> v2 = new Vector<>();
			for (int j = 0; j < len; j++) {
				v2.add(j, scanner.nextLong());
			}
			Collections.sort(v1);
			Collections.sort(v2, (arg0, arg1) -> {
				return (int) (arg1 - arg0);
			});
			findMin(v1, v2);
			results.add(min);
			min = 0;
		}
		for (int i = 0; i < results.size(); i++) {
			System.out.println("Case #" + (i + 1) + ": " + results.get(i));
		}
		scanner.close();
	}

}
