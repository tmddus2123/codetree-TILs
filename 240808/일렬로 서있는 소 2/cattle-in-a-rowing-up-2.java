import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] cow = new int[num];

        for(int i=0; i<num; i++) {
            cow[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<num; i++) {

            for(int j=i+1; j<num; j++) {

                if(cow[i] > cow[j]) {
                    continue;
                }

                for(int k=j+1; k<num; k++) {

                    if(cow[j] > cow[k]) {
                        continue;
                    }
                    count++;
                }
            }
        }
        System.out.print(count);

    }
}