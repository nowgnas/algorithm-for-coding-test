package programmers.lv2.할인행사;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //    https://school.programmers.co.kr/learn/courses/30/lessons/131127
    public int solution(String[] want, int[] number, String[] discount) {
        /*
         * 일정 금액 지불 - 10일 동안 회원 자격
         * 회원 대상으로 매일 한 가지 제품 할인
         * 할인 제품은 하루에 하나 구매 ㄱ능
         * 원하는 제품과 수량이 할인하는 날짜와 10일 연속으로 일치할 경우에 회원가입
         */

        int count = 0;

        for (int i = 0; i < discount.length; i++) {
            count++;
            // start i
            Map<String, Integer> map = new HashMap<>();
            int flag = 2;
            for (int k = 0; k < want.length; k++) {
                map.put(want[k], number[k]);
            } // 시작점마다 복사

            for (int j = i; j < discount.length; j++) {
                if (map.containsKey(discount[j])) {
                    // 키가 있으면 동작
                    map.put(discount[j], map.get(discount[j]) - 1);
                } else {
                    // 키가 없으면 동작
                    System.out.println("nokey");
                    flag = 1;
                    break;
                }
            }
            if (flag == 2) {
                count++;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] want = {"banana", "apple", "rice", "pork", "pot"};
//        int[] number = {3, 2, 2, 2, 1};
//        String[] discount = {
//                "chicken", "apple", "apple",
//                "banana", "rice", "apple",
//                "pork", "banana", "pork",
//                "rice", "pot", "banana",
//                "apple", "banana"};

        String[] want = {"apple"};
        int[] number = {10};
        String[] discount = {
                "banana", "banana", "banana"
                , "banana", "banana", "banana",
                "banana", "banana", "banana",
                "banana"
        };


        System.out.println(solution.solution(want, number, discount));
    }
}
