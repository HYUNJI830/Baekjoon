import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 질의 요청 개수

		PriorityQueue<Integer> pQueue = new PriorityQueue<>((o1, o2) -> {
			// 우선 순위 큐 선언

			int first_abs = Math.abs(o1); // 절댓값 기준으로 정렬되도록 설정하기
			int second_abs = Math.abs(o2);
			if (first_abs == second_abs)
				if (first_abs == second_abs)
					return o1 > o2 ? 1 : -1; // 절댓값이 같으면 음수 우선 정렬하기

			return first_abs - second_abs; // 절댓값을 기준으로 정렬하기
		});
		for (int i = 0; i < N; i++) { // n만큼 반복
			int request = Integer.parseInt(br.readLine());
			if (request == 0) { // 요청이 0일 때 : 큐가 비어 있으면 0, 비어 있지 않으면 큐의 front값 출력하기 (poll())
				if (pQueue.isEmpty())
					System.out.println(0);
				else
					System.out.println(pQueue.poll());

			} else { // 요청이 1일 때 : 새로운 데이터를 우선순위 큐에 더하기(add())
				pQueue.add(request);
			}

		}
	}
}