import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(solution(N));
    }

    public static int solution(int num){
        int answer = 0;
        int tmp = 1;
        int digit = 1;

        while(num > 0){
            int n = 9 * tmp;

            num -= n;

            if(num >= 0){
                answer += n * digit;
            }
            else{
                answer += (n + num) * digit;
            }

            tmp *= 10;
            digit++;
        }
        return answer;
    }
}

