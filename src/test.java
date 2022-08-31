import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        /*String num = bf.readLine();
        System.out.println(num.length());
        String[] num2 = num.split("");

        int length = num2.length;
        // num2.length 4보다 작은지 확인한다.
        System.out.println("*".repeat(num2.length-4)+num2[length-1]);
        */
        int[] d = {1,3,2,5,4};
        int answer = 0;
        int win;
        Arrays.sort(d);
        int sum = 0;
                for(int i = 0; i<d.length; i++){
                    sum += d[i];
                    if(answer <= sum){
                        break;
                    }
                    answer++;
                }

        int num = Integer.parseInt(bf.readLine());
        System.out.println(Integer.toBinaryString(num));
        System.out.println(num/2);
    }
}
