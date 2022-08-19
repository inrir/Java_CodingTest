package study.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1063 {
    /**
     * 열: 알파벳, 행: 숫자
     * A ~ H(right), 1 ~ 8(top)
     * 돌과 킹(동일시 같은 방향으로 돌 가)
     * input
     * 킹 위치, 돌 위치, 움직이는 횟수
     *
     * 배열로 구현 공간을 설정해두고
     * 해당 움직임 연산자로 배열의 값 설정하면 될거 같다.
     * 있는 경우를 1이라고 하고 값이 2일 경우는 돌과 만난 것이므로 돌도 적용한다.
     * 아웃 경우는 움직일때마다 확인해준다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        char[] king = st.nextToken().toCharArray();
        char[] rock = st.nextToken().toCharArray();
        int count = Integer.parseInt(st.nextToken());
        String[]action = new String[count];



        int[][] space = new int[8][8];
        int first = king[0]-'A';
        int second = 7-(king[1]-'1');
        int rock_first = rock[0]-'A';
        int rock_second = 7-(rock[1]-'1');
        space[king[0]-'A'][7-(king[1]-'1')] = 1; // king 자리
        space[rock[0]-'A'][7-(rock[1]-'1')] = 1; // 돌 자리 -> 필요 없을 듯...

        for(int i =0; i<count;i++){
            action[i] = bf.readLine();
            switch (action[i]){
                case "R":
                    first++;
                    break;
                case "L":
                    first--;
                    break;
                case "B":
                    second--;
                    break;
                case "T":
                    second++;
                    break;
                case "RT":
                    first++;
                    second++;
                    break;
                case "LT":
                    first--;
                    second++;
                    break;
                case "RB":
                    first++;
                    second--;
                    break;
                case "LB":
                    first--;
                    second--;
                    break;
                default:
                    break;
            }

            // 체크 포인트 나가지 않았는지, 돌과 겹치지 않았는지?

        }




    }
}

