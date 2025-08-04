import java.io.*;

public class W1_수이어쓰기1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    //N
        int digitCount = 1; //현재 수의 자릿수 개수
        int digit = 10; // 현재 자릿수

        int result=0;   //전체 자릿수
        for (int i = 1; i < N + 1; i++) {   //1 부터 N 까지 반복
            if (i % digit == 0) { //나머지가 0 이되는 부분 (= 자릿수가 변경되어야 하는 부분)
                digitCount++;    //자리수 개수 증가
                digit*=10;      //자리수 증가
            }
            result+=digitCount; //+ 각 숫자의 자리수의 개수
        }
        System.out.println(result);
    }
}
