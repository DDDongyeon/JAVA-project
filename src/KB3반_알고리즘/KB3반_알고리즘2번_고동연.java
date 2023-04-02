package KB3반_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class KB3반_알고리즘2번_고동연 {
	static int n, m,k;
	public static int[] arr;
	public static int[] s;
	public static int[] sum=new int[50];
	public static int[] max;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n];
		s = new int[3];// 숫자 3개 선택
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		combination(0, 1);
		
		if (sum[k] <= m) {
			for (int i = 0; i<=sum.length; i++) {
				int max = i;
				for (int j = i + 1; j <= sum.length; j++) {
					if (sum[j] > sum[max]) {
						max = j;
					}
				}
			}
			int temp=sum[max];
			System.out.println(sum[max]);
		}
	}

	private static int combination(int cnt, int start) {
		// 종료 조건 검사
		if (cnt == 3) {
			sum[k] = arr[s[0] - 1] + arr[s[1] - 1] + arr[s[2] - 1];
			return sum[k];
		}
		k++;
		// 로직 처리
		for (int i = start; i <= n; i++) {
			s[cnt] = i;
			combination(cnt + 1, i + 1);
		}
		return start;
	}
}
