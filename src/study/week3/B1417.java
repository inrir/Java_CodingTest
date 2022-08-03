package study.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 백준 1417
 * 풀이 시간: 30분, 실행시간: 124ms
 * 첫번쨰 수가 남은 수들보다 높은 수가 되어야한다.
 * 처음에 높은 수 first, second를 비교하려고 했는데, 틀렸다고 나와서
 * 첫번째 수와 남은 수 중에 높은 수를 비교 +1 -1 => 높은 수를 재탐색
 * 재탐색하면서 효율성 문제가 생길듯해서 우선순위 큐(log N)_add, poll, peek로 재탐색한다.
 */
public class B1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine()); // 후보자 수 입력

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int target = Integer.parseInt(bf.readLine()); // 첫번째 값
        for(int i =1; i<num;i++){ // 가장 큰 수를 뽑아내기에 유리함.
            priorityQueue.add(Integer.parseInt(bf.readLine()));
        }


        int count = 0; // 최종 출력해줄 값
        while(!priorityQueue.isEmpty() && priorityQueue.peek() >= target){
            count++;
            target++;
            priorityQueue.add(priorityQueue.poll() - 1); // 제일 최고의 값에 -1 해주기
        }


        System.out.println(count);
    }

}
