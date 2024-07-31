import java.util.*;

class Student {
    String grade;
    int score;

    Student(String grade, int score) {
        this.grade = grade;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student[] st = new Student[5];

        int min = 100;
        int num = 0;

        for(int i=0; i<5; i++) {
            String g = sc.next();
            int s = sc.nextInt();

            if(min > s) {
                min = s;
                num = i;
            }

            Student stu = new Student(g, s);
            st[i] = stu;
        }
        System.out.print(st[num].grade + " " + st[num].score);
    }
}