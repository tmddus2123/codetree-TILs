import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person p) {
        if(this.height == p.height) {
            return p.weight - this.weight;
        } else {
            return this.height - p.height;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Person[] p = new Person[num];

        for(int i=0; i<num; i++) {
            String name = sc.next();
            int h = sc.nextInt();
            int w = sc.nextInt();
            p[i] = new Person(name, h, w);
        }

        Arrays.sort(p);

        for(int i=0; i<num; i++) {
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight);
        }
    }
}