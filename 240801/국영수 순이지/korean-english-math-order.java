import java.util.*;

class Score implements Comparable<Score> {
    String name;
    int kor;
    int eng;
    int math;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Score score) {
        if(this.kor == score.kor) {
            if(this.eng == score.eng) {
                return score.math - this.math;
            } else {
                return score.eng - this.eng;
            }
        } else {
            return score.kor - this.kor;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Score[] s = new Score[num];
        
        for(int i=0; i<num; i++) {
            String name = sc.next();
            int k = sc.nextInt();
            int e = sc.nextInt();
            int m = sc.nextInt();

            s[i] = new Score(name, k, e, m);
        }

        Arrays.sort(s);
        
        for(int i=0; i<num; i++) {
            System.out.println(s[i].name + " " + s[i].kor + " " + s[i].eng + " " + s[i].math);
        }
    }
}