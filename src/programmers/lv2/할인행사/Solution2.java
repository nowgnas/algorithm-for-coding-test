package programmers.lv2.할인행사;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int solution(String[] want, int[] number, String[] discount) {

        int day = 0;
        for (int i = 0; i < discount.length; i++) {
            // 0일 부터 구매 시작하기
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < want.length; j++) {
                map.put(want[j], number[j]);
            } //  map 만들기
            int status = 0;
            // 할인 받을 수 있는 항목 빼기
            for (int j = i; j < i + 10; j++) {
                // i일 부터 뒤로 쭉 사기
                if (map.containsKey(discount[j]) && map.get(discount[j]) > 0) {
                    System.out.println(discount[j] + " " + map.get(discount[j]));
                    map.put(discount[j], map.get(discount[j]) - 1);
                    status++;
                } else {
                    // 할인 항목과 사고 싶은 항목 일치 안하는 경우
                    break;
                }
            }
            // break로 나오면
            if (status == (discount.length - i)) {
                day = i;
                break;
            }
        }
        return day;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {
                "chicken", "apple", "apple",
                "banana", "rice", "apple",
                "pork", "banana", "pork",
                "rice", "pot", "banana",
                "apple", "banana"};

//        String[] want = {"apple"};
//        int[] number = {10};
//        String[] discount = {
//                "banana", "banana", "banana"
//                , "banana", "banana", "banana",
//                "banana", "banana", "banana",
//                "banana"
//        };


        System.out.println(solution.solution(want, number, discount));
    }


}
