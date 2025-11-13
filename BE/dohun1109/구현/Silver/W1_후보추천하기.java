package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class W1_후보추천하기 {
    static List<Student> photoFrame = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int totalLikes = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < totalLikes; i++) {
            int id = Integer.parseInt(st.nextToken());

            if (isDuplicatedId(id)) continue;   //id 중복 이면 추천수만 올리고 continue

            if (photoFrame.size() < N) {   //사진틀에 공간이 남는 경우
                photoFrame.add(new Student(id, i));
            }else {
                // 1:추천수 2:경과시간 기준으로 정렬
                photoFrame.sort((a, b) ->{
                    if (a.likes != b.likes) {
                        return Integer.compare(a.likes, b.likes);   //추천 수 오름차순 정렬
                    }
                    // 들어온 시간 순으로 정렬 (맨앞이 가장 오래된 학생사진)
                    return Integer.compare((a.insertTime), (b.insertTime));
                });
                photoFrame.remove(0);  
                photoFrame.add(new Student(id, i));
            }
        }

        //id 를 기준으로 정렬
        photoFrame.sort(Comparator.comparingInt(a -> a.id));
        StringBuilder sb = output();
        System.out.println(sb);


    }

    static StringBuilder output() {
        StringBuilder sb = new StringBuilder();
        for (Student stu : photoFrame) {
            sb.append(stu.id).append(' ');
        }
        return sb;
    }

    static boolean isDuplicatedId(int id) {
        for (Student stu : photoFrame) {
            if (stu.id == id) {
                stu.likes++;    //중복임으로 추천수만 증가
                return true;
            }
        }
       return false;
    }



    static class Student {
        int id;
        int likes;
        int insertTime;    //경과 시간을 구하기 위한 프레임에 들어간 시점의 index를 저장

        public Student(int id, int insertTime) {
            this.id = id;
            this.likes = 1; //초기화 되는 시점에는 항상 1
            this.insertTime = insertTime;
        }
    }


}
