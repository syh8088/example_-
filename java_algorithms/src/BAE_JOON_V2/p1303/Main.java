package BAE_JOON_V2.p1303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1303
 *
 * 💥풀이
 * https://velog.io/@lifeisbeautiful/Java-%EB%B0%B1%EC%A4%80-1303%EB%B2%88-%EC%A0%84%EC%9F%81%EC%A0%84%ED%88%AC-%EC%9E%90%EB%B0%94
 */
class Main {

    public static void solution(int n, long[] arr) throws IOException {








    }

    static int N; // 가로
    static int M; // 세로

    static char map[][];
    static boolean visit[][];

    static int white_count;
    static int black_count;

    // 상 하 좌 우 범위 체크에서 사용할 배열
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int count = 0;

    public static void main(String[] args) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//        N = Integer.parseInt(st.nextToken()); // 가로
//        M = Integer.parseInt(st.nextToken()); // 세로
//
//        // 1. 지도 만들기
//        map = new char[M][N];
//
//        for (int i = 0; i < M; i++) {
//            String str = br.readLine();
//            for (int j = 0; j < N; j++) {
//                char ch = str.charAt(j);
//                map[i][j] = ch;
//            }
//        }
        N = 5;
        M = 5;
        map = new char[][] {
                {'W', 'B', 'W', 'W', 'W'},
                {'W', 'W', 'W', 'W', 'W'},
                {'B', 'B', 'B', 'B', 'B'},
                {'B', 'B', 'B', 'W', 'W'},
                {'W', 'W', 'W', 'W', 'W'}
        };
        visit = new boolean[M][N];

        solution2();
    }

    /**
     * 정답
     */
    public static void solution2() {

        white_count = 0;
        black_count = 0;


        // 2. DFS를 이용해서 탐색하기.
        for (int i = 0; i < M; i++) { // 세로
            for (int j = 0; j < N; j++) { // 가로

                if (!visit[i][j]) {
                    char color = map[i][j];
                    count = 0;
                    DFS(j, i, color);

                    if (color == 'W') {
                        white_count += count * count;
                    }
                    else {
                        black_count += count * count;
                    }
                }

            }
        }

        System.out.println(white_count + " " + black_count);
    }

    public static void DFS(int x, int y, char color) {

        visit[y][x] = true;
        count += 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                continue;
            }

            if (map[ny][nx] != color) {
                continue;
            }

            if (visit[ny][nx]) {
                continue;
            }

            DFS(nx, ny, map[ny][nx]);
        }

    }

}