package COMPANY_EMULSION.section4.part6;

import java.util.*;

class Solution {


    class Meeting {

        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int solution(int n, int[][] meetings) {

        int answer = 0;






        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(2, new int[][]{{0, 5}, {2, 7}, {4, 5}, {7, 10}, {9, 12}}));
        System.out.println(T.solution(3, new int[][]{{3, 9}, {1, 10}, {5, 8}, {10, 15}, {9, 14}, {12, 14}, {15, 20}}));
        System.out.println(T.solution(3, new int[][]{{1, 30}, {2, 15}, {3, 10}, {4, 12}, {6, 10}}));
        System.out.println(T.solution(4, new int[][]{{3, 20}, {1, 25}, {5, 8}, {10, 15}, {9, 14}, {12, 14}, {15, 20}}));
    }
}