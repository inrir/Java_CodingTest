package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준: 5622
 * UNUCIC: 868242 = 30 + 6
 * 각 번호는 걸리는 초와도 같다.
 * 1: 2
 * WA 9 + 2 = 10 + 3
 * ABC: 2
 * DEF: 3
 * GHI: 4
 * JKL: 5
 * MNO: 6
 * PQRS: 7
 * TUV: 8
 * WXYZ: 9
 * 아스키 코드로 숫자의 범위로 나누는 것이 어떨까?
 * 함수 return 형 방식으로 하면 효율적일 듯
 *
 *
 */
public class B5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        char[] input = bf.readLine().toCharArray();
        for(int i = 0; i<input.length; i++){
            count += check(input[i]);
        }
        System.out.println(count);
    }
    public static int check(char point){
        int checked = point - 'A';
        if(checked >= 0 && checked < 3)
            return 3;
        if(checked >= 3 && checked < 6)
            return 4;
        if(checked >= 6 && checked < 9)
            return 5;
        if(checked >= 9 && checked < 12)
            return 6;
        if(checked >= 12 && checked < 15)
            return 7;
        if(checked >= 15 && checked < 19) // 4개
            return 8;
        if(checked >= 19 && checked < 22)
            return 9;
        if(checked >= 22 && checked < 26) // 4개
            return 10;
        return -1; // 실패
    }
}
