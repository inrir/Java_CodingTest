package study.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 666, 1666, 2666...
 * 666(01~9) 9666
 * 10666 ~ 16660
 * 풀이 시간: 1시간 생각하고 답지 봄
 * 설명: 점화식을 만들어서 푸는 법을 계속 생각했는데, 고려해야할 사항도 많고 제약점도 컸다.
 * 답지를 보고 점화식 같은 방법이 있지만, 브루트포스가 현재로서 실용적이라고 생각함.
 */

public class B1436 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int count = 666;
        while(num > 1){

            count++;
            if(String.valueOf(count).contains("666")){
                num--;
            }


        }
        System.out.println(count);
    }
}
