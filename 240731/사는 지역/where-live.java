import java.util.*;

class Person {
    String name;
    String addr;
    String city;

    Person(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Person[] ps = new Person[num];

        for(int i=0; i<num; i++) {
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();

            ps[i] = new Person(name, addr, city);
        }

        int last = 0;
        String lastName = ps[0].name;

        for(int i=1; i<num; i++) {
            if(lastName.compareTo(ps[i].name) < 0) {
                lastName = ps[i].name;
                last = i;
            }
        }

        System.out.println("name " + ps[last].name);
        System.out.println("addr " + ps[last].addr);
        System.out.println("city " + ps[last].city);
    }
}