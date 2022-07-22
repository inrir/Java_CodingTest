package study.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;
import java.util.*;

/**
 * 풀이시간: 약 1시간
 * 입력: 입력 개수, 숫자들
 * 출력: 숫자들의 인덱스를 출력한다.(중복된 수는 제거한다.)
 */
public class B18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine()); // 숫자 개수 입력받기

        StringTokenizer st = new StringTokenizer(bf.readLine()); // 띄워서 입력받으려고 한다.
        int[] input = new int[num];
        for(int i =0; i< num; i++){ // 입력 받아준다.
            input[i] = Integer.parseInt(st.nextToken());
        }

        int[] ptr = input.clone(); // deep copy, 추후 배열시 상관없도록 깊은 복사한다.
        Arrays.sort(input); // 정렬한다.

        HashMap<Integer, Integer> removeMap = new HashMap<>(); // ArrayList로 시간초과되는 것 같아서 Map 이용
        int index = 0;
        for(int i: input){
            if(!removeMap.containsKey(i)){ // 중복된 요소는 삽입 X
                removeMap.put(i, index); // key, value => value, key(형식으로 받아준다.)
                index++;
            }
        }


        /* 2. ArrayList가 시간 초과의 주범임. 어쨋든 동적 배열이기에 삽입 혹은 인덱스 찾는데 시간 초과된 것 추정
        List<Integer> duplicate_removeList = new ArrayList<Integer>(); // 중복 제거한 정렬된 값을 받기 위해서
        for(int i: input){
            if(!duplicate_removeList.contains(i)) // 중복제거된 값들만 받는다.
                duplicate_removeList.add(i);
        }
        Collections.sort(duplicate_removeList); // 정렬
        */

        /* 1. 출력하는 부분에서 시간 초과될 가능성 고려 -> 그래도 시간초과됨
       for(int i = 0; i<num-1; i++){
           System.out.print(duplicate_removeList.indexOf(input[i]) + " ");
       }
        System.out.println(duplicate_removeList.indexOf(input[num-1]));
        */

        StringBuilder sb = new StringBuilder(); // 출력 방향을 다르게 한다. StringBuilder로 한번에 받아서 한번 출력으로 끝낸다
        for(int i = 0; i<num;i++){
            sb.append(removeMap.get(ptr[i])).append(' ');
        }
        System.out.println(sb);
    }

}
