import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");

        int count = 0;
        for(int i=0; i<arr.length - 1; i++) {
            if(!arr[i].equals("("))  {
                continue;
            }
            for(int j=i + 1; j<arr.length; j++) {
                if(arr[j].equals(")")) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}