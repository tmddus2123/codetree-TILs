import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] a = sc.nextLine().split("");
        String[] b = sc.nextLine().split("");

        int count = 0;
        for(int i=0; i<a.length-1; i++) {
            if(a[i].equals(b[0])) {
                if(a[i+1].equals(b[1])) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}