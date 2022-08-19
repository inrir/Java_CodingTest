package study.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2606 {
    /**
     * 풀이시간: ?, 실행시간: ?
     * 전형적인 그래프 문제로
     * 각 이어진 값들을 트리로 이어주고, 탐색해주면 될거 같다.
     * BFS 사용법 익히기.. 공부 필요
     */

    static boolean check[];
    static int computer[][];
    static int count;
    static int com, net;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        com = Integer.parseInt(bf.readLine());
        net = Integer.parseInt(bf.readLine());

        computer = new int[com+1][com+1];
        check = new boolean[com+1];

        for(int i = 0; i<net; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            computer[num1][num2] = 1;
            computer[num2][num1] = 1;
        }
        bfs(1);
        System.out.println(count);

    }

    public static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);

        while(!queue.isEmpty()){
            x = queue.poll();
            check[x] = true;
            for(int i = 1; i<com + 1; i++){
                if(!check[i] && computer[x][i] == 1){
                    check[i] = true;
                    queue.add(i);
                    count++;
                }
            }
        }
    }
}
