package programmers.lv1.문자열내맘대로정하기;

import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(n) == o2.charAt(n)) {
                return o1.compareTo(o2);
            }
            return String.valueOf(o1.charAt(n)).compareTo(String.valueOf(o2.charAt(n)));
        });
        return strings;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] input = {"sun", "bed", "car"};
        String[] result = solution.solution(input, 1);
        System.out.println(Arrays.toString(result));

    }
}
