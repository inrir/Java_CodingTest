package Week2;

// n은 d(n)의 생성자, d(n) = n + n의 각 자리수

// 생성자가 없는 숫자를 셀프넘버 ex) 1, 3, 5, 7, 9, 20, 31 ...
public class B4673 {

    /*
    * 1부터해서 생성자를 만들고 생성자와 동일한 경우 생성자 인정 X
    * 아닌 경우 만들어진 것을 뺀다.
    * 동적 배열을 활용해서 remove 하는 방향으로 고려
    *
    * 예외: 만약 없는 것을 삭제할 경우 어떻게 하지..! -> 동적 배열이 아닌
    * 정적 배열로 모든 값 0으로 초기화한 후 생성자에 해당하는 값을 +1 해준다.
    * 예외: 인덱스를 초과한 경우는 어떻게 하지 -> 취급 안하기
    * */

    public static void main(String[] args) {

        int[] a = new int[10001];
        int check = 0;
        for(int i = 1; i<a.length; i++){
            check = calc(i);
            if(check <= 10000){
                a[check]++;
            }
        }
        for(int i = 1; i<a.length; i++){
            if(a[i] == 0){
                System.out.println(i);
            }
        }
    }

    public static int calc(int a){
        int ans = 0;
        ans += a;
        // Stram을 이용한 방법
        /*int[] arrNum =  Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i<arrNum.length; i++){
            ans += arrNum[i];
        }*/

        while(a>0){ // 제일 직관적인 방법으로 보인다.
            ans += a%10;
            a /= 10;
        }
        return ans;
    }
}
