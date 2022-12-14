package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15649_N과M1_S3 {	//맞았는데 너무 오래걸림,, 다른방법은?

	static int N, M;
	static int[] nums;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		nums = new int[M];
		visited = new boolean[N+1];
		Perm(0);
	}

	private static void Perm(int cnt) {
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(nums[i] + " ");
			}
			System.out.println();
			return;
		} else {
			for (int i = 1; i <= N; i++) {
				if (!visited[i]) {
					visited[i] = true;
					nums[cnt] = i;
					Perm(cnt+1);
					visited[i] = false;
				}
			}
		}
	}

}
