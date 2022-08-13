package study.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 백준 16472
 * 풀이시간: 분, 실행시간: ms
 * 문자열을 배열로 분리해서 각 인덱스별로 값들을 비교해본다.
 *
 * count // 총 길이를 센다.
 * change(변동 폭을 확인하고) <= num.length -> 초과시 재정비한다.
 * 이후 count의 최대 맥스값을 출력해준다.
 * 연속된 문자열이르모 문자열 전체 순차탐색해주면 되지 않을까?
 *
 */
public class B16472 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine()); // 종류의 개수

        String target = bf.readLine(); // 체크할 문자열
        String[] arr = target.split("");


        // while을 종료시키는 방안??
        int count = 0; // 총길이를 계속 수정하기
        int change = 0; // 변화량으로 num.length를 초과시 종료
        int point = 0;
        int max = 0;
        int tmp = -1;
        HashMap<String, Integer> hashMap = new HashMap<>();

        while(point < arr.length -1){
            count = 0; // 다시 재설정시 값 초기화
            change = 0; // 다시 재설정시 값 초기화
            hashMap.clear(); // 모든 값 제거
//            System.out.println("count: "+count+" "+"change: "+change+" point: "+point);

            for(int i = point; i<arr.length; i++){
                count++;
//                System.out.println("i번째: "+ i+"count: "+count+" "+"change: "+change+" point: "+point);
                if(i != point){ // 시작점을 제외하기 위해서 해준 부분
                    tmp = hashMap.size();
                    hashMap.put(arr[i], 0);
                    if(tmp != hashMap.size()){ // 앞과 뒤의 다른 부분이 발생시 change++ 해주기 위해서
                        change++;
                        if(change == 1){ // 처음 변한 지점에서 추후 다시 시작하기 위해서이다.
                            point = i;
                        }
                    }
                }

                if(change >= num){ // 가질 수 있는 종류의 수를 초과하기 때문에 멈추게된다.
//                    System.out.println("i번째: "+ i+" change: "+ change);
                    i = arr.length;
                }
            }

            max = (max>=count)? max:count; // count가 제일 길었던 것을 저장한다.

        }

        System.out.println(max);



    }
}
