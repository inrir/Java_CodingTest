package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] num = new int[N];
        for(int i =0; i<N;i++){ // 값 대입
            num[i] = Integer.parseInt(st.nextToken());
        }

        int max = num[0];
        int index = 0;
        for(int i =1; i<N; i++){ // 최대값 추출
            if(max < num[i]){
                max = num[i];
                index = i;
            }
        }
        double avg = 0.0;
        double tmp;
        for(int i = 0; i<N; i++){
            tmp = ((double)num[i]/max)*100; // 소수점 2자리로 분리하기
            avg += (Math.round(tmp*100)/100.0);

        }

        System.out.println(avg/N);


    }
}
