package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 1152
 * 공백으로 분리해서 단어의 개수를 출력하면된다.
 * 예외케이스: 공백으로 시작할 수 있다?
 */
public class B1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int length = 0;
        String[] input = bf.readLine().split(" ");
        if(input.length == 0){ // 만약 이런 경우에서는 input[0]의 접근하면 에러가 뜨므로 선행처리
            System.out.println(0);
            System.exit(0); // 프로그램 강제 종료
        }
        length = input.length;

        if(input[0].isEmpty()){ // 공백으로 시작한다면 empty가 발생한다.
            length -= 1;
        }
        System.out.println(length);


    }
}
