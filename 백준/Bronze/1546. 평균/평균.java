import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//변수 N에 과목의 수 입력받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//길이가 N인 배열 A[] 선언
		int[] A = new int[N];
		//for문, A[i] 각 점수 저장하기
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		//for문, 최고점은 변수 max, 총점은 변수 sum
		long max = 0;
		long sum = 0;
		for (int i = 0; i < N; i++) {
			if(A[i]>max) {
				max =A[i];
			}
			 sum = sum + A[i];	
		}
		System.out.println(sum * 100.0 / max / N);
	}
}
