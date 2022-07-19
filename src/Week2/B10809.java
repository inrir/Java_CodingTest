package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[26];
        for(int i =0; i<num.length; i++){
            num[i] = -1;
        }// 모두 -1로 초기화

        String input = bf.readLine();
        int tmp = 0;
        for(int i = 0; i<input.length(); i++){
            tmp = input.charAt(i)-97; // String -> char
            if(num[tmp] == -1){
                num[tmp] = i;
            }
        }

        for(int i =0; i<num.length - 1; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println(num[num.length - 1]);

    }
}
