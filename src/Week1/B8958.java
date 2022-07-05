package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        String[] check = new String[num];
        int[] sum = new int[num];
        int count = 0;
        for (int i = 0; i < num; i++) { // 입력받기
            check[i] = bf.readLine();
            String[] list = check[i].split("");
            for(int j = 0; j< list.length;j++){
//                System.out.println(list[j].getClass() + list[j]);
                if(list[j].equals("O")){ // 문자열의 경우 비교법
                    count++;
                }else{
                    count = 0;
                }
//                System.out.println(j+"번째의 값: "+count + "합계 현황: "+sum[i]);
                sum[i] += count;

            }
            count = 0; // 누수 방지
//            System.out.println(i+"번째 "+"중간 합계: "+sum[i]);
        }

        for(int i = 0; i < num; i++){
            System.out.println(sum[i]);
        }

    }
}