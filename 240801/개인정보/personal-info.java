import java.util.*;

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
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

            p[i] = new Person(name, h, w);
        }
        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");
        for(int i=0; i<5; i++) {
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight);
        }

        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return b.height - a.height;
            }
        });
        System.out.println("\nheight");
        for(int i=0; i<5; i++) {
            System.out.println(p[i].name + " " +p[i].height + " " + p[i].weight);
        }

    }
}