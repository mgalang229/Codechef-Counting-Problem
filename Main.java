import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n];
			int[] parity = new int[2];
			Arrays.fill(parity, 0);
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
				parity[a[i]%2]++;
			}
			if (parity[1] == 0) {
				System.out.println("NO");
				continue;
			}
			System.out.println((parity[1] % 2 == 0 ? "YES" : "NO"));
		}
		fs.close();
	}
}
