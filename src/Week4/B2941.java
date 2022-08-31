package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 특정으로 변경되는 형식을 분별한다.
 * check(문자열을 입력해주고) -> if exist return 1; else return 0;
 * 3번까지 확인해준다.?
 */
public class B2941 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        int count = 0;
        for(int i = 0; i<input.length()-1; i++){
            String tmp = ""+input.charAt(i)+input.charAt(i+1);
            int a = check(tmp);
            if(a == 1){
                count++;
                i++;
            }
            else if(a == 2){
                tmp = String.valueOf(input.charAt(i)+input.charAt(i+1)+input.charAt(i+2));
                a = check(tmp);
                if(a == 3){
                    count++;
                    i += 2;
                }else{
                    count++;
                }
            }else{
                count++;
            }
            if(i == input.length()-2){
                if(a == 0){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
    public static int check(String input){
        if(input.equals("c="))
            return 1;
        if(input.equals("c-"))
            return 1;
        if(input.equals("dz"))
            return 2;
        if(input.equals("dz="))
            return 3;
        if(input.equals("d-"))
            return 1;
        if(input.equals("lj"))
            return 1;
        if(input.equals("nj"))
            return 1;
        if(input.equals("s="))
            return 1;
        if(input.equals("z="))
            return 1;
        return 0;

    }
}
