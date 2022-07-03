package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int B = 42;
        int[] check = new int[42]; // 선언시 초기값 0으로 선언됨
        int[] A = new int[10];
        int count = 0;
        for(int i = 0; i<10; i++){
            A[i] = Integer.parseInt(bf.readLine());
            if(check[A[i]%B] == 0){
//                System.out.println(i+"번째 "+A[i]%B+"지금 이거 "+A[i]+" count: "+count);
                count++;
            }
            check[A[i]%B]++;
        }
        System.out.println(count);




    }
}
