package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine()); // 숫자 개수 입력

        String input = bf.readLine();
//        System.out.println(input.length());
        int result = 0;
        for(int i = 0; i<num; i++){
            result += (input.charAt(i) - '0');
        }
        System.out.println(result);

    }
}
