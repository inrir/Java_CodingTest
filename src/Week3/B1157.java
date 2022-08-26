package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 풀이시간: 30분, 실행시간: 300ms
 *
 * 문자열을 입력받고 제일 많이 사용된 문자를 출력하는 것
 * (대문자와 소문자를 구분 X)
 * 어떻게 받아줄 지를 고민하고 어떤 자료구조를 쓸지도 생각했지만
 * 그냥 간단하게 변수로 공간을 마련하고 해결했다.
 * for 한번 반복이라서 O(n)이라고 본다.
 *
 */
public class B1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        char[] input = bf.readLine().toUpperCase().toCharArray();
        int[] alph = new int[26];
        int max = 0;
        int tmp = 0;
        int index = 0;
        for(int i =0; i< input.length; i++){
            alph[input[i]-'A']++;
            if(max > alph[input[i]-'A']){
            }
            else{
                tmp = max;
                max = alph[input[i]-'A'];
                index = input[i]-'A';
            }
        }

        if(max == tmp){
            System.out.println("?");
        }else{
            System.out.println((char)(index+'A'));
        }
    }
}
