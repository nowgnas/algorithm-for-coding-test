package programmers.lv3.네트워크;

public class Solution {
    static int n = 3;
    //    static int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
    static int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};


    static int count;
    static boolean[] visited;

    public static void main(String[] args) {
        /*
         * computers[0][1] 0이랑 1 연결
         * 0의 1 1 0 => 0 0, 0 1
         * */
        visited = new boolean[computers.length];

        for (int i = 0; i < computers.length; i++) {
            if (visited[i]) continue;
            dfs(i);
            count++;
        }
        System.out.println(count);
    }

    static void dfs(int now) {
        visited[now] = true;
        for (int i = 0; i < computers.length; i++) {
            if (computers[now][i] == 1 && i != now && !visited[i]) {
                dfs(i); // 현재 컴퓨터와 연결되어 있는 컴퓨터로 가기
            }
        }
    }
}
