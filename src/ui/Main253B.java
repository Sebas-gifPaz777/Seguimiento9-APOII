package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main253B {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Entrada.txt"));
		PrintWriter s = new PrintWriter(new File("Salida.txt"));
		int x = sc.nextInt();
		int k[] = new int[x];
		for (int i = 0; i < x; i++) {
			k[i] = sc.nextInt();
		}
		Arrays.sort(k);
		int r = 0, l = 0, ans = 1000001;
		while (l < x) {
			while (r < x && k[r] <= 2 * k[l]) {
				r++;
			}
			ans = Math.min(ans, x - r + l);
			l++;
		}
		s.println(ans);
		s.close();
	}

}
