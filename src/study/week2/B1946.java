package study.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

//        int num = Integer.parseInt(bf.readLine()); // 테스트 케이스 받기
        int employees = Integer.parseInt(bf.readLine()); // 지원자 명수 받기
        int[] a = new int[employees];
        int[] b = new int[employees];
        for(int i = 0; i<employees; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        // 값과 위치에 대한 것을 나누어야하는데?


    }
}
