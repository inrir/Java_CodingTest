package study.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.concurrent.TransferQueue;

/**
 * QUEUE 방식으로 먼저 요청된 것을 먼저 인쇄한다.
 * 중요도를 통해 높은 순으로 출력한다.
 *
 * 입력: 테스트 케이스 개수,
 * 문서의 개수, 몇 번째에 놓여있는지를 나타내는 정수?
 * N의 중요도가 차례대로 주어진다.
 *
 * 중요도가 동일하면 FIFO 형식으로 하고 우선순위도 고려 => 우선순위 큐?
 */
public class B1966 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine()); // 테스트 케이스 개수
        for(int i =0; i<count; i++){
            PriorityQueue<num> priorityQueue = new PriorityQueue<>(); // 낮은 숫자가 우선순위 있음
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int docu = Integer.parseInt(st.nextToken()); // 문서의 개수
            int target = Integer.parseInt(st.nextToken()); // 목표물의 위치(location)

            StringTokenizer stt = new StringTokenizer(bf.readLine());
            int target_priority = 0;
            int[] a = new int[docu];
            for(int j = 0; j<docu;j++){
                a[j] = Integer.parseInt(stt.nextToken());

                if(j == target){
                    target_priority = a[j];
                }
                priorityQueue.add(new num(a[j],j));

                System.out.println(i+ " num번째 "+a[j]+" "+(docu-j-1)+" ");

            }

            int target_count = 0;

            while(!priorityQueue.isEmpty()){
                target_count++;
                num b = priorityQueue.remove();
                System.out.println(i+ " 번째 "+b.first+" "+b.second+" "+target_count);

                if(b.second == target && b.first == target_priority){
                    System.out.println(target_count);
                    break;
                }

            }

        }

    }

    static class num implements Comparable<num>{
        private int first; // 우선순위
        private int second; // 들어간 번째

        public num(int first, int second){
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(num o) {
           return o.first - this.first;

        }
    }
}
