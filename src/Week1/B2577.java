package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());

        int sum = A*B*C;
        int[] check = {0, 0 ,0 ,0, 0, 0, 0, 0, 0, 0};

        while((sum) != 0){
            check[sum%10]++;
            sum = sum/10;
        }
        for(int i = 0; i<10; i++){
            System.out.println(check[i]);
        }
    }
}
