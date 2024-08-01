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
        if(this.height != s.height) {
            return s.height - this.height;
        }

        if(this.weight != s.weight) {
            return s.weight - this.height;
        }

        return this.number - s.number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Student[] s = new Student[num];

        for(int i=0; i<num; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            s[i] = new Student(height, weight, i+1);
        }

        Arrays.sort(s);

        for(int i=0; i<num; i++) {
            System.out.println(s[i].height + " " + s[i].weight + " " + s[i].number);
        }
    }
}