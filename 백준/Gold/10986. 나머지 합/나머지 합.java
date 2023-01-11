import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//5 3(n개의 숫자, n의 숫자 합(S)이 3의 배수)
		//1 2 3 1 2 
		//정답 : 7 (n의 누적합이 3의 배수인 경우 해당 n개 합)
		
		//n : 1 2 3 1 2
		//S : 1 3 6 7 9
	
		//[Scanner]
		//n(수열의 갯수)
		//m(나누어 떨어져야 하는 수)
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//[S(합 배열)]
		//for문
		long[] S = new long[n];
		S[0] = sc.nextInt(); // S 배열에 값을 부여해야 하기 때문에
		for (int i = 1; i < n; i++) {
			S[i] = S[i-1] + sc.nextInt();
		}	
		
		//[C(m의 배수를 담은 배열)]
		//for문
		long answer = 0;
		long[] C = new long[m]; //m인 이유 : m으로 나눈 나머지가 가능한 수 0~m-1 즉, m개 
		for (int i = 0; i < n; i++) { // 합 배열의 모든 값에 %연산
			int a = (int)(S[i] % m); // S 배열이 long형 -> int 형변환
			//a는 m의 나머지 가능 숫자(0,1)
			if(a == 0) answer ++; //a=0경우는 m의 배수인 경우 /경우의 수 : 3
			C[a]++; //나머지가 같은 인덱스 개수 카운팅
			//나머지(=인덱스) 0 1 
			//C[]배열에     3 2 
			
		}
		
		//부분합 따른 경우의 수
		//배수가 아니여도 나머지가 동일하다면, 해당 (i,j)의 부분의 합은 m의 배수가 된다
		//S[i]%m == S[j]%m -> (S[i] -S[j]) % m = 0
		//예시 S[3] - S[0] = 7 - 1 = 6 
		for (int i = 0; i < m; i++) {
			if(C[i] > 1) { //C[i] > 1 : 개수가 0인경우 제외 (C[0]=3, C[1]=2)
				
				answer = answer + (C[i]*(C[i]-1)/2);
				//3C2 : (3*2)/(2*1)
				//2C2 : (2*1)/(2*1)			
		}

	}
		System.out.println(answer);

 }
}
