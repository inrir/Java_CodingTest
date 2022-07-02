package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1110 {
    public static void main(String[] args) throws IOException {
        // 입력 선언
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

//        System.out.print("숫자를 입력하세요: ");
        int num = Integer.parseInt(bf.readLine());
        int result = num;
        if(num<10) {
            result = num * 10;
            num = num * 10;
            // call search
            System.out.println(search(num, result, 0));
        }else{
//            System.out.println(result);
            // call search
            System.out.println(search(num, result, 0));
        }

    }

    public static int search(int test, int result, int count){ // 오직 두자리수만 받기
        int tester;
        if(test < 10){
            tester = test*10 + test;
        }else{
            int mid = test/10 + test%10;
            if(mid < 10){
                tester = (test%10)*10 + mid;
            }else{
                tester = (test%10)*10 + mid%10;
            }

        }
//        System.out.println("tester: "+count+"번째" + tester);
        count = count + 1;
        if(tester == result){
            return count;
        }else{
            return search(tester, result, count);
        }
    }
}
