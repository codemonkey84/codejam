/**
 * 
 */
package com.codemonkey84.codejam.qualfier2010;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * @author lenovo
 *
 */
public class StoreCredit {

	public static void main(String [] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		Map<Double, Integer> map = null;
		String [] outputs = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			Double credit = scanner.nextDouble();
			int itemCount = scanner.nextInt();
			map = new HashMap<>();
			for (int j = 0; j < itemCount; j++) {
				Double cost = scanner.nextDouble();
				if (map.containsKey(cost) && credit == 2*cost) {
					outputs[i] = "Case #"+(i+1)+": "+map.get(cost)+" "+(j+1);
				} else {
					map.put(cost, (j+1));
					if (map.containsKey(credit - cost)) {
						outputs[i] = "Case #"+(i+1)+": "+map.get(credit-cost)+" "+(j+1);
					}
				}
			}
		}
		scanner.close();
		for (int i = 0; i < outputs.length; i++) {
			System.out.println(outputs[i]);
		}
	}
}
