import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result;
        String inputNum = br.readLine();

        int inputNumLength = inputNum.length();
        int inputToInt = Integer.parseInt(inputNum);

        // 일의 자리의 경우
        result = inputToInt * inputNumLength;
        if (inputNumLength == 1) {
            System.out.println(inputNum);
            return;
        }

        int temp = 9;
        int multiple = 1;

        result -= temp;
        for (int i = 2; i < inputNumLength; i++) {
            multiple *= 10;
            temp += 9 * multiple;
            result -= temp;
        }
        System.out.println(result);
    }
}
