package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2908
 * 734 -> 437 거꾸로 읽고 큰 수를 찾는다.
 * 입력: 두 수는 같지 않은 세자리 수: 1 exchange 3 position
 */
public class B2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int num1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        if(num1 > num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }

    }
}
