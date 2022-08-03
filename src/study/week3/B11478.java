package study.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B11478 {
    /**
     * 백준 11478
     * 풀이시간: , 실행시간:
     * 연속한 문자열로 담는다. 중복한 것들은 따로 분리해야한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String target = bf.readLine(); // 처음 입력

        ArrayList<String> list = new ArrayList<String>();
        String test;


        for(int i = 0; i<target.length();i++){
            for(int j = i+1; j<=target.length(); j++){
                test = target.substring(i, j);
//                System.out.println("i = " + i + "j = " + j+"test = " + test);
                if(!list.contains(test)){
                    list.add(test);
                }
            }
        }

        System.out.println(list.size());


    }
}
