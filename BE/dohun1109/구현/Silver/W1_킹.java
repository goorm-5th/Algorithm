package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class W1_킹 {
    //1 ~ 8
//    R : 한 칸 오른쪽으로
//    L : 한 칸 왼쪽으로
//    B : 한 칸 아래로
//    T : 한 칸 위로
//    RT : 오른쪽 위 대각선으로
//    LT : 왼쪽 위 대각선으로
//    RB : 오른쪽 아래 대각선으로
//    LB : 왼쪽 아래 대각선으로

    static int[] dx = {1,-1,0,0,1,-1,1,-1}; //R,L,B,T ,RT,LT,RB,LB
    static int[] dy = {0,0,-1,1,1,1,-1,-1};
    static String[] moveTypes = {"R", "L", "B", "T", "RT", "LT", "RB", "LB"};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        ChessPiece king = new ChessPiece(st.nextToken());
        ChessPiece stone = new ChessPiece(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            int dir = -1;
            String info = br.readLine();
            dir = getDirection(info);

            int nextKingX = king.x + dx[dir];
            int nextKingY = king.y + dy[dir];

            //범위 밖이면 무시
            if (!king.isInBounds(nextKingX, nextKingY)) continue;

            //돌이랑 곂치면
            if (nextKingX == stone.x && nextKingY == stone.y) {
                int nextStoneX = stone.x + dx[dir];
                int nextStoneY = stone.y + dy[dir];

                if (!stone.isInBounds(nextStoneX, nextStoneY)) continue;

                stone.x = nextStoneX;
                stone.y = nextStoneY;
            }

            //왕 이동
            king.x = nextKingX;
            king.y = nextKingY;
        }

        StringBuilder sb = new StringBuilder();
        sb.append((char)(king.x + 'A')).append(king.y + 1)
                .append('\n').append((char)(stone.x + 'A')).append(stone.y + 1);
        System.out.println(sb);

    }

    static int getDirection(String info) {
        for (int j = 0; j < 8; j++) {
            if (moveTypes[j].equals(info)) {
                return j;
            }
        }
        return -1;
    }


    static class ChessPiece{
        int x,y;

        public ChessPiece(String position) {        // (0,0) ~ (7,7)
            this.x = position.charAt(0) - 'A';
            this.y = position.charAt(1) - '1';
        }

        boolean isInBounds(int nx, int ny) {
            return nx>=0 && ny>=0 && nx<=7 && ny <=7;
        }
    }
}
