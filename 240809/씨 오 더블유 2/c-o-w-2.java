import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String[] str = sc.next().split("");
   
        int count = 0;
        for(int i=0; i<num-2; i++) {
            for(int j=i; j<num-1; j++) {
                for(int k=j; k<num; k++) {
                    if(str[i].equals("C") && str[j].equals("O") && str[k].equals("W")) {
                        count++;
                    }

                }
            }
        }
        System.out.print(count);
    }
}