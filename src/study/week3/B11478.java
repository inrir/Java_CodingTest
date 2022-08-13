package study.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class B11478 {
    /**
     * 백준 11478
     * 풀이시간: 30분, 실행시간: 780ms ?? 생각보다 오래 걸린다..?
     * 연속한 문자열로 담는다. 중복한 것들은 따로 분리해야한다.
     * + Arraylist 시간초과가 뜬다. -> HashMap or treeMap 고려
     * ababc
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String target = bf.readLine(); // 처음 입력

//        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        String test;


        for(int i = 0; i<target.length();i++){
            for(int j = i+1; j<=target.length(); j++){
                test = target.substring(i, j);
//                System.out.println("i = " + i + "j = " + j+"test = " + test);
                /*if(!list.contains(test)){
                    list.add(test);
                } -> Arraylist에서 문제가 생겨 HOTFIX*/

                hashMap.put(test, 0); // 테스트 갱신됨
            }
        }

//        System.out.println(list.size());
        System.out.println(hashMap.size());

    }
}
