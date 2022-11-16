package swea.보호필름;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int D, W, K; // 레이어숫자, 가로크기, 검사 적합 기준
    static int[][] origin;
    static int[] select; // 부분집합에 포함되는 재료 기록 -1:안포함, 0:A약품, 1:B약품
    static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();
        for (int tc = 1; tc <= TC; tc++) {
            D = sc.nextInt();
            W = sc.nextInt();
            K = sc.nextInt();

            origin = new int[D][W];

            for (int i = 0; i < D; i++) {
                for (int j = 0; j < W; j++) {
                    origin[i][j] = sc.nextInt();
                }
            } // 기존 필름 상태
            select = new int[D];

            ans = Integer.MAX_VALUE;
            subset(0);
            System.out.println("#" + tc + " " + ans);
        }
    }

    private static void subset(int idx) { // idx는 레이어 번호
        if (idx == D) { // 약품 시나리오 하나 완성됨! 시뮬레이션 해보자!
            System.out.println(Arrays.toString(select));
            int[][] copy = deepcopy(origin);

            int tmp = 0;
            for (int i = 0; i < D; i++) {
                if (select[i] >= 0) { // -1이면 그대로 냅두는 레이어. 0 또는 1이면 약품 투입
                    tmp++; // 약품 주입하는 레이어 몇개인지 카운트하자. 정답가능성.
                    for (int j = 0; j < W; j++) {
                        copy[i][j] = select[i];
                    }
                }
            }
            if (check(copy)) { // 안정성 체크
                ans = Math.min(ans, tmp);
            }

            return;
        }

        select[idx] = -1; // 현재 레이어에 약품 투입 안하는 선택
        subset(idx + 1); // 기다림.
        select[idx] = 0; // 현재 레이어에 약품 A 투입해보기
        subset(idx + 1);
        select[idx] = 1; // 현재 레이어에 약품 B 투입해보기
        subset(idx + 1);
    }

    static int[][] deepcopy(int[][] arr) {
        int[][] copy = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                copy[i][j] = arr[i][j];
            }
        }
        return copy;
    }

    static boolean check(int[][] arr) {
        for (int j = 0; j < W; j++) {
            int cnt = 1;
            for (int i = 1; i < D; i++) {
                if (arr[i - 1][j] == arr[i][j]) // 내 윗행이랑 약품 같으면? 갯수 기록
                    cnt++;
                else
                    cnt = 1;

                if (cnt == K)
                    break;
            }
            if (cnt < K)
                return false;
        }
        return true;
    }
}
