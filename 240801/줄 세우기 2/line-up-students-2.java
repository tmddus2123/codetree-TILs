import java.util.*;

class Student implements Comparable<Student>{
    int height, weight, number;

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student s) {
        if(this.height == s.height) {
            return s.weight - this.weight;
        } else {
            return this.height - s.height;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Student[] s = new Student[num];

        for(int i=0; i<num; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            s[i] = new Student(h, w, i+1);
        }

        Arrays.sort(s);

        for(Student ss : s) {
            System.out.println(ss.height +  " " + ss.weight + " " + ss.number);
        }
    }
}