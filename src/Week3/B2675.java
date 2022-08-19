package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 풀이시간: 10분, 실행시간: 124ms
 * 테스트케이스의 양이 크지 않아 완전탐색도 고려할 수 있었다.
 * 문자열을 반복해주는 부분만 고려한다면 무난하다.
 */
public class B2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());

        for(int i = 0; i< count; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int iter = Integer.parseInt(st.nextToken());

            String[] input = st.nextToken().split("");
            String sum = "";
            for(int j = 0; j<input.length; j++){
                sum += input[j].repeat(iter);
            }
            System.out.println(sum);
        }


    }
}
