package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine()); // 테스트 케이스의 개수 입력

        for(int i = 0; i<num; i++){
            double avg = 0.0;
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int count = Integer.parseInt(st.nextToken()); // 값의 개수를 입력 받는다.
            // 점수에 대해서 평균을 받는다.
            // 평균에 초과인 경우를 조사하고
            // 초과인 것들의 반올림하여 소수점 셋째 자리까지 출력한다.

            int[] a = new int[count];

            for(int j = 0; j<count; j++){
                a[j] = Integer.parseInt(st.nextToken());
                avg += a[j];

            }
            avg = avg/count; // 평균을 종합한다.
//            System.out.println(i+"번째 avg = " + avg);
            double avg_count = 0.0; // 개수를
            for(int j =0; j<count; j++){ // 성적 비율 산출
                if(avg < a[j]){
                    avg_count += 1;
//                    System.out.println("경우에 들어간 것 = " + a[j]);
                }
            }
//            System.out.println(i+"번째 avg_count = " + avg_count);

            avg_count = (avg_count/count)*100; // 퍼센트로 환산
//            System.out.println(Math.round(avg_count*1000)/1000.0);
            // 40.0으로 나오기 때문에 소수점 3자리로 출력할 수 없다.
            System.out.println(String.format("%.3f", avg_count)+"%");
        }
    }
}
