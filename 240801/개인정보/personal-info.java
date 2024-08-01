import java.util.*;

class Person implements Comparable<Person>{
    String name;
    int height, type;
    double weight;

    public Person(String name, int height, double weight, int type) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public int compareTo(Person p) {
        if(p.type == 1) {
            return this.name.compareTo(p.name);
        } else {
            return p.height - this.height;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] p = new Person[5];
        for(int i=0; i<5; i++) {

            String name = sc.next();
            int h = sc.nextInt();
            double w = sc.nextDouble();

            p[i] = new Person(name, h, w, 1);
        }
        Arrays.sort(p);

        System.out.println("name");
        for(int i=0; i<5; i++) {
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight);
            p[i].type = 2;
        }

        Arrays.sort(p);
        System.out.println("\nheight");
        for(int i=0; i<5; i++) {
            System.out.println(p[i].name + " " +p[i].height + " " + p[i].weight);
        }

    }
}