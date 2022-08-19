package study.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3135 {

    /**
     * 백준 3135
     * 풀이 시간: 20분, 실행시간: 124ms
     * input A -> B
     * 즐겨찾기: 개수 -> ? ? ? ..
     * 경우 나눈기
     * 1. 즐겨찾기 버튼에서 B와 가까운 정도
     * 2. A에서 B와 가까운 정도 (A != B)
     *
     * 삼항 연산자 부분에서 "="가 빠져서 틀렸습니다.. 발생
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(bf.readLine()); // 즐겨찾기 개수
        int[] num = new int[count]; // 즐겨찾기 주파수
        for(int i = 0; i<count; i++) {
            num[i] = Integer.parseInt(bf.readLine());
        }

        // 차이가 제일 최소인 것을 구하고 편차를 출력
        int min = Math.abs(A-B);
        int tmp;
        for(int i =0; i< count; i++){
            tmp = Math.abs(num[i]-B);
            min = min <= tmp ? min: (tmp+1);
        }

        System.out.println(min);


    }
}
