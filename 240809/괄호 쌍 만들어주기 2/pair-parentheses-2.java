import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.next().split("");
        int count = 0;

        for(int i=0; i<str.length - 1; i++) {
            if(!str[i].equals("(") || !str[i + 1].equals("(")) {
                continue;
            }
            for(int j=i; j<str.length - 1; j++) {
                if(str[j].equals(")") && str[j + 1].equals(")")) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}