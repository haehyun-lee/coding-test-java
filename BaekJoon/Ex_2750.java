import java.util.Arrays;
import java.util.Scanner;

// 수 정렬하기 (오름차순)
public class Ex_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		for (int i : arr) {
			sb.append(i + "\n");
		}

		System.out.println(sb);
	}
}
