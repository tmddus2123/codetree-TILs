import java.util.*;

class Product {
    String name;
    String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Product() {
        this.name = "codetree";
        this.code = "50";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String c = sc.next();

        Product p = new Product();
        System.out.println("product " + p.code + " is " + p.name);

        p = new Product(n, c);
        System.out.println("product " + p.code + " is " + p.name);
    }
}