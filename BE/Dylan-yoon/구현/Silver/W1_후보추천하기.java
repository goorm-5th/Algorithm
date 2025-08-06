import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int totalLikes = Integer.parseInt(br.readLine());
        int[] inputLikeStudent = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayList<Student> pictures = new ArrayList<>();

        for (int i = 0; i < totalLikes; i++) {
            int studentNum = inputLikeStudent[i];
            boolean isPosted = false;

            for (Student s : pictures) {
                if (s.number == studentNum) {
                    s.likes++;
                    isPosted = true;
                    break;
                }
            }

            if (!isPosted) {
                if (pictures.size() >= N) {
                    Collections.sort(pictures); 
                    pictures.remove(0); 
                }
                pictures.add(new Student(studentNum, 1, i));
            }
        }

        pictures.sort(Comparator.comparingInt(s -> s.number));

        StringBuilder sb = new StringBuilder();
        for (Student s : pictures) {
            sb.append(s.number).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

class Student implements Comparable<Student> {
    int number = 0;
    int likes = 0;
    int time = 0;

    public Student(int number, int likes, int time) {
        this.number = number;
        this.likes = likes;
        this.time = time;
    }

    void clearLike() {
        likes = 0;
    }

    @Override
    public int compareTo(Student student) {
        if (this.likes != student.likes) {
            return this.likes - student.likes;
        } else {
            return this.time - student.time;
        }
    }

    public int getNumber() {
        return number;
    }

    public int getLikes() {
        return likes;
    }

    public int getTime() {
        return time;
    }
}
