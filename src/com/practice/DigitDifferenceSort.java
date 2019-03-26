package com.practice;

		import java.util.ArrayList;
		import java.util.Collections;

		public class DigitDifferenceSort {
			public static int[] finddigitDifferenceandSort(int[] p) {
				int[] finres = new int[p.length];
				for (int i = 0; i < finres.length; i++) {
					finres[i] = p[i];
				}
				int digit = 0;
				ArrayList<Integer> A = new ArrayList<Integer>();
				ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
				for (int i = 0; i < 10; i++) {
					B.add(new ArrayList<Integer>());
				}
				for (int i = 0; i < p.length; i++) {
					int temp = 0;
					temp = p[i];
					while (p[i] > 0) {
						digit = p[i] % 10;
						p[i] /= 10;
						A.add(digit);
					}
					int b = Collections.max(A);
					int c = Collections.min(A);
					int diff = b - c;
					B.get(diff).add(temp);
					A.clear();
				}
				int k = 0;
				for (int i = 0; i < B.size(); i++) {
					for (int j = 0; j < B.get(i).size(); j++) {
						if (B.get(i).size() == 0)
							continue;
						else {
							finres[k] = B.get(i).get(j);
							k++;
						}
					}
				}
				return finres;
			}

			public static void main(String[] args) {
				int[] a = {153,123,7,85,67,87};
				for (int i : finddigitDifferenceandSort(a)) {
					System.out.print(i + " ");
				}
			}
		


	}

