import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1063 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int locationKingX;
    static int locationKingY;
    static int locationStoneX;
    static int locationStoneY;
    static int N;

    public static void main(String[] args) throws IOException {
        input();

        for (int i = 0; i < N; i++) {
            moveKing();
        }

        // 다시 변환..
        System.out.println(transformToChar(locationKingX) + "" + locationKingY);
        System.out.println(transformToChar(locationStoneX) + "" + locationStoneY);
    }

    static void moveKing() throws IOException {
        String input = br.readLine();
        /*
         * 1.킹이 움직일 지점이 유효한가?
         * 2.유효하면 그자리에 돌이 있는가?
         * 3.돌이 있으면 그돌은 그만큼 움직일 수 있는가?
         */
        int[] nextKing = nextLoaciton(locationKingX, locationKingY, input);

        // 1.
        if (nextKing[0] < 1 || 8 < nextKing[0] || nextKing[1] < 1 || 8 < nextKing[1]) {
            return;
        }

        // 2.
        if (!(nextKing[0] == locationStoneX && nextKing[1] == locationStoneY)) {
            locationKingX = nextKing[0];
            locationKingY = nextKing[1];
            return;
        }

        // 3. 돌에 마주친다면
        int[] nextStone = nextLoaciton(locationStoneX, locationStoneY, input);
        if (nextStone[0] < 1 || 8 < nextStone[0] || nextStone[1] < 1 || 8 < nextStone[1]) {
            return;
        }

        locationKingX = nextKing[0];
        locationKingY = nextKing[1];

        locationStoneX = nextStone[0];
        locationStoneY = nextStone[1];
    }

    static int[] nextLoaciton(int x, int y, String input) {
        switch (input) {
            case "R":
                return new int[] { x + 1, y };
            case "L":
                return new int[] { x - 1, y };
            case "B":
                return new int[] { x, y - 1 };
            case "T":
                return new int[] { x, y + 1 };
            case "RT":
                return new int[] { x + 1, y + 1 };
            case "LT":
                return new int[] { x - 1, y + 1 };
            case "RB":
                return new int[] { x + 1, y - 1 };
            case "LB":
                return new int[] { x - 1, y - 1 };
            default:
                return null;
        }
    }

    static void input() throws IOException {
        String inputFirst = br.readLine();
        String[] splitInput = inputFirst.split(" ");

        int[] locationKing = transformPosition(splitInput[0]);
        int[] locationStone = transformPosition(splitInput[1]);
        N = Integer.parseInt(splitInput[2]);

        locationKingX = locationKing[0];
        locationKingY = locationKing[1];
        locationStoneX = locationStone[0];
        locationStoneY = locationStone[1];
    }

    static int[] transformPosition(String input) {
        int x = 0;
        int y = 0;

        String[] splitedString = input.split("");

        x = transformToInt(splitedString[0]);
        y = Integer.parseInt(splitedString[1]);

        return new int[] { x, y };
    }

    static int transformToInt(String input) {
        switch (input) {
            case "A":
                return 1;
            case "B":
                return 2;
            case "C":
                return 3;
            case "D":
                return 4;
            case "E":
                return 5;
            case "F":
                return 6;
            case "G":
                return 7;
            case "H":
                return 8;
            default:
                return 0;
        }
    }

    static char transformToChar(int input) {
        switch (input) {
            case 1:
                return 'A';
            case 2:
                return 'B';
            case 3:
                return 'C';
            case 4:
                return 'D';
            case 5:
                return 'E';
            case 6:
                return 'F';
            case 7:
                return 'G';
            case 8:
                return 'H';
            default:
                return 'A';
        }
    }
}
