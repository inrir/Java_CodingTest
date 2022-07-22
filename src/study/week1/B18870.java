package study.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;
import java.util.*;

public class B18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine()); // 숫자 개수 입력받기

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] input = new int[num];
        for(int i =0; i< num; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        int[] ptr = input.clone(); // deep copy
        Arrays.sort(input); // 정렬한다.
        
        HashMap<Integer, Integer> removeMap = new HashMap<>();
        int index = 0;
        for(int i: input){
            if(!removeMap.containsKey(i)){
                removeMap.put(i, index); // key, value => value, key
                index++;
            }
        }


        /* ArrayList가 시간 초과의 주범이라고 본다.
        List<Integer> duplicate_removeList = new ArrayList<Integer>(); // 중복 제거한 정렬된 값을 받기 위해서
        for(int i: input){
            if(!duplicate_removeList.contains(i)) // 중복제거된 값들만 받는다.
                duplicate_removeList.add(i);
        }
        Collections.sort(duplicate_removeList); // 정렬
        */

/*
       for(int i = 0; i<num-1; i++){
           System.out.print(duplicate_removeList.indexOf(input[i]) + " ");
       }
        System.out.println(duplicate_removeList.indexOf(input[num-1]));*/

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<num;i++){
            sb.append(removeMap.get(ptr[i])).append(' ');
        }
        System.out.println(sb);
    }

}
