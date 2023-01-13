import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//n 변수 저장
		//사용 변수 초기화** : count / start / end / sum
		//반복문
		//sum < n :  c 0 / s 0 / e+ / sum +
		//sum = n : c+ / s 0 / e + / sum +
		//sum > n : c 0 / s + / e 0 /sum -
		
		//1+2+3+4+5 : 15
		//7+8 : 15
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int start = 1;
		int end = 1;
		int sum = 1; //연속된 자연수의 합
		int count = 1; // sum이 N과 같은 경우의 수
		
		//while 반복문
		//조건 3가지의 경우
		while(end != n) {
			if(sum < n) {
				end ++;
				sum += end;
			}else if(sum > n) {
				sum -= start; //합을 리셋하기 위해서 
				start ++;
			}else { //sum ==n
				count ++;
				end ++;
				sum += end;
			}
		}
		System.out.println(count);
	}

}
