[![Pull Requests][pr-shield]][pr-url] [![issues][issue-shield]][issue-url]
# 🔥코딩 테스트 스터디🔥
- 매 주  [5문제](https://github.com/goorm-5th/Algorithm/issues)를 풀고, **✔매 일 17:40** 까지 [코드 리뷰](https://github.com/goorm-5th/Algorithm/pulls)를 진행합니다.
  - 문제는 각자 원하는 문제 1개 [백준](https://www.acmicpc.net/problem/tags)에서 보충합니다.
  - **2시간 동안 1\~2문제**를 풀이하며, 주로 [Solved.ac](https://solved.ac/problems/level)기준 실버에서 골드난이도의  **코딩테스트 문제**나 기업**코딩테스트 문제**를 풀이합니다.
    - 문제는 미리 풀어보는 것을 방지하기 위해, 당일에 공개합니다.
  - 문제 풀이 이후 간단히 풀이와 느낌을 공유합니다.

## 주차별 알고리즘 주제
- 1주차 : 구현+ 빅오표기법 + 시간/공간복잡도
- 2주차 : 누적합, 투포인터, 슬라이딩 윈도우
- 3주차 : DFS/BFS/백트래킹

<br>
<br>

## 🔸 참여 방법

### 🔹 다음 주에 풀고 싶은 문제 신청 방법 [(✈ 문제 등록하기)](https://github.com/goorm-5th/Algorithm/issues/new?template=add-a-problem.md)
- Issues에 풀고 싶은 문제를 추가해 주세요.
<br>


### 🔹 File Naming 컨벤션
- `문제번호.java`
  > ex) [해당 주차]_[문제이름].java

<br>

### 🔹 Directory 구조
```
└── 📂알고리즘_주제
       ├── 📂 Silver
       │      ├── 💾해당 주차_문제이름.java
       │      ├── 💾...
       │      └── 💾해당 주차_문제이름.java
       ├── 📂...
       └── 📂Gold
└── 📂알고리즘_주제
       ├── 📂 Silver
       │      ├── 💾해당 주차_문제이름.java
       │      ├── 💾...
       │      └── 💾해당 주차_문제이름.java
       ├── 📂...
       └── 📂Gold
```

<br>

### 🔹 Commit Message 컨벤션
```
type : subject

```
#### ✔ Type
- **Add**: 소스 코드 파일(.java) 추가
- **Refactor**: 소스 코드 수정
- **Style**: 소스 코드 형식(format) 수정, 변수 네이밍 수정, 주석 추가/삭제 등
  - (코드 동작에 영향이 없는 수정)
- **Chore**: 그 외 기타 작업

#### ✔ Subject
- 50자 이하의 간단한 제목을 사용한다.
  > ex) Add: #문제번호  <br>
  > ex) Refactor: 완전 탐색 -> 이분 탐색 <br>
  > ex) Style: 함수명 변경

<br>

### 🔹 Pull Request 규칙
- PR 템플릿에 맞게 작성한다.
  - 문제를 푸는 과정에서 본인이 생각한 내용을 작성한다.
  - 코드 설명을 작성한다. (단, 주석에 작성한 경우 생략한다.)
  - 특히 리뷰를 받고 싶은 부분을 작성한다.
    - Markdown Codeblock을 이용하여 코드 일부를 발췌해서 작성한다.
    - 특히 리뷰를 받고 싶은 부분은, 리뷰어의 시간을 아낄 수 있게 본인 코드를 충분히 설명해 주세요.
- Reviewer는 본인을 제외한 스터디원을 추가한다.
- Label은 `Review Request`로 추가한다.
- main branch에 병합되면, 병합된 branch는 삭제시킨다.

<br>

### 🔹 소스 코드 업로드 및 리뷰 요청 방법
- `본인_이름(영어_이니셜⭕, 한글❌)`/`이슈_번호(문제_번호❌)`
  > ex) kdh/#1 <br>
  - branch 이름에 한글이 들어가면 문제가 생겨서 반드시 ⭐본인 이름을 영어 이니셜⭐로 branch를 생성해 주세요!
  - 문제 번호가 아닌, ⭐이슈 번호⭐로 branch를 생성해 주세요!
- 각 **문제마다 branch를 새롭게 생성**해서, 소스 코드를 push 후 리뷰 요청하는 방식
1. `main`에서 새 branch를 생성한다.
2. 브랜치명은 `[본인 이름]`/`[이슈 번호]`로 생성한다.
2. 본인이 해결한 문제의 소스 코드를 **본인의 branch**에 push한다.
3. `[본인 이름]`/`[이슈 번호]` 브랜치에서 -> **main**브랜치로 **Pull Request**를 통해 코드 리뷰를 요청한다.
4. 스터디원에게 리뷰를 받은 후, Approve가 완료되면 Squash and Merge을 한다.

<br>

### 🔹 Code Review 규칙
- 자유롭게 의견을 제시한다.
  - 잘했다고 생각하는 부분 칭찬하기
    - 피드백 할 게 없으면 칭찬해 주세요👍
  - 다른 풀이 방법 공유하기
    - 코드 전체를 공유하는 것이 아닌, 키워드나 간단한 소개만 해 주세요.
  - 개선이 필요한 부분 설명하기
    - 단, 개선이 필요한 이유를 충분히 설명해 주세요.
    - 정답 코드를 알려주기 보다는, 스스로 고민하고 개선 방법을 선택할 수 있게 해 주세요.
    - 리뷰 과정이 숙제 검사가 아닌, 학습 과정으로 느낄 수 있게 해 주세요.
  - 궁굼한 부분 물어보기
- 오픈 커뮤니케이션 지향
  > ex) ~ 하는 게 어떨까요? / ~ 부분은 ~ 문제가 있는 것 같은데 괜찮을까요?

#### 📚 References
- [SW 개발을 위한 코드리뷰(우아한 테크 세미나)](https://www.youtube.com/watch?v=ssDMIcPBqUE&ab_channel=%EC%9A%B0%EC%95%84%ED%95%9CTech)
- [효과적인 코드리뷰를 위한 리뷰어의 자세(카카오 테크)](https://tech.kakao.com/2022/03/17/2022-newkrew-onboarding-codereview/)

<br>





<br>
<br>




[pr-shield]: https://img.shields.io/github/issues-pr/goorm-5th/Algorithm?style=for-the-badge
[pr-url]: https://github.com/goorm-5th/Algorithm/pulls

[issue-shield]: https://img.shields.io/github/issues/goorm-5th/Algorithm?style=for-the-badge
[issue-url]: https://github.com/goorm-5th/Algorithm/issues


