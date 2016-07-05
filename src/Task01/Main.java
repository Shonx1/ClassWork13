package Task01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a[] = { 3, 5, 6 };
		int b[] = { 4, 1, 2 };
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i <= n; i++) {
				if (i % a[j] == 0 && i % b[j] != 0) {
					System.out.print(i + " ");
				}
			}
		}
	}
}