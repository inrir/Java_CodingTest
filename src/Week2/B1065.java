package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1065 {
    // 한수란 각 자리가 등차수열을 이룬다고 할 때
    // 각 자리수의 차이가 동일한 경우로 산정한다.
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(a.readLine());
        System.out.println(count(num));
    }

    public static int count(int a){
        int count = 0;
        for(int i = 1; i<=a; i++){
            if(i<100){
                count++;
            }else{
                if(((i/100) - (i/10)%10) == ((i/10)%10 - (i%10))){
                    count++;
                }
            }
        }
        return count;
    }
}
