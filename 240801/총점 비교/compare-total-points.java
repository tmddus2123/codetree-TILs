import java.util.*;

class Score implements Comparable<Score> {
    String name;
    int kor, eng, math;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Score score) {
        return (this.kor + this.eng + this.math) - (score.kor + score.eng + score.math);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Score[] score = new Score[num];

        for(int i=0; i<num; i++) {
            String name = sc.next();
            int k = sc.nextInt();
            int e = sc.nextInt();
            int m = sc.nextInt();

            score[i] = new Score(name, k, e, m);
        }

        Arrays.sort(score);

        for(int i=0; i<num; i++) {
            System.out.println(score[i].name + " " + score[i].kor + " " + score[i].eng + " " + score[i].math);
        }
    }
}