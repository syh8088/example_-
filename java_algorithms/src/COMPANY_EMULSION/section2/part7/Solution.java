package COMPANY_EMULSION.section2.part7;

import java.util.*;

class Solution {

    public int solution(int[] keypad, String password) {

        int answer = 0;








        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[] {
                2, 5, 3,
                7, 1, 6,
                4, 9, 8
        }, "7596218"));
        System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
        System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
        System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
    }
}