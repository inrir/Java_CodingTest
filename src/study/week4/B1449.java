package study.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1449 {
    /**
     * 풀이시간: 30분 실행시간: 136ms
     * 좌우 0.5만큼 간격으로 물을 준다면, 새는 곳 기준으로 -0.5 +0.5 => 1 씩 하는 것인가?
     * 마지막에 테이프를 겹쳐서 붙이는 것이 가능하고 자를 수 없다는 점에서
     * 끼리끼리 값들을 정렬할 필요가 있다.
     * 시작점기준으로 + 테이프 길이가 안에 들어오는지를 판단한다. (들어오는 것 기준으로 풀고)
     * 아닌것은 새롭게 테이프를 추가해야한다.
     *
     * 시간제한, 메모리제한..!
     * 1ms
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()); // 물이 새는 곳
        int L = Integer.parseInt(st.nextToken()); // 테이프의 길이
        st = new StringTokenizer(bf.readLine());
        int[] leak = new int[N];
        for(int i = 0; i<N;i++){
            leak[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(leak); // 기본 오름차순 배열
        int count = 1; // 최종 테이프 개수
        int start = leak[0]; // N이 자연수이므로 최소 1개 있음

        for(int i = 1; i<N; i++){
            if(leak[i] >= start && leak[i] < start+L){

            }
            else{
                start = leak[i];
                count++;
            }
        }

        System.out.println(count);

    }
}
