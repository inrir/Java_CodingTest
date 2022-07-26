package study.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팰린드롬 만들기
 *
 * AABB -> ABBA?
 *
 */
public class B1213 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        int[] a = new int[26];

        for(int i = 0; i<s.length(); i++){ // 문자열 해당 알파벳별로 보관
            a[s.charAt(i) - 'A']++;
        }

        int midIdx = 0, odd = 0;
        for(int i = 0; i<a.length;i++){
            if(a[i] % 2 != 0){
                midIdx = i; // 한개만 있는 것
                odd++; // 한개만 있는 것의 개수
            }
        }

        if((odd > 1)||(s.length()%2 == 0 && odd==1)){
            // 한개만 있는 것이 1개 초과이거나 한개만 있는 것 있음에도 총 개수가 짝수일 경우도 불가
            System.out.println("I'm Sorry Hansoo");
        } else{
            String ans = "";
            for(int i = 0; i<a.length; i++){
                for(int j =0; j<a[i]/2; j++){ // 절반개만 가져가기 + 나머지는 rev에 처리
                    ans += ((char)(i+'A'));
                }
            }
            String rev = new StringBuffer(ans).reverse().toString(); // 문자열 역순 만들기(펠리드룸을 위해서)
            if(odd == 1) ans += ((char)(midIdx+'A')); // 한개만 있는 거 넣어주기
            System.out.println(ans + rev); // 마지막으로 뒷 부분 추가
        }
    }
}
