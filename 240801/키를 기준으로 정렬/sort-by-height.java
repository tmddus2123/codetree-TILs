import java.util.*;

class Person {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Person[] p = new Person[num];
        for(int i=0; i<num; i++) {
            String n = sc.next();
            int h = sc.nextInt();
            int w = sc.nextInt();

            p[i] = new Person(n, h, w);
        }

        Arrays.sort(p, (a, b) -> a.height - b.height);

        for(int i=0; i<num; i++) {
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight);
        }
    }
}