import java.util.*;

class Number {
    String[] numArr;
    int strike;
    int ball;

    public Number(String[] numArr, int strike, int ball) {
        this.numArr = numArr;
        this.strike = strike;
        this.ball = ball;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int num = sc.nextInt();

        Number[] n = new Number[num];

        for(int i=0; i<num; i++) {
            String[] arr = sc.next().split("");
            int s = sc.nextInt();
            int b = sc.nextInt();

            n[i] = new Number(arr, s, b);
        }
        
        int count = 0;
        for(int i=1; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                if (j == i) continue;

                for(int k=1; k<=9; k++) {
                    if (k == i || k == j) continue;

                    String answer = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
                    boolean result = true;
                    for(int l=0; l<num; l++) {
                        int strike = 0;
                        int ball = 0;

                        for(int m=0; m<3; m++) {
                            if(answer.indexOf(n[l].numArr[m]) >= 0) {
                                if(answer.indexOf(n[l].numArr[m]) == m) {
                                    strike++;
                                } else {
                                    ball++;
                                }
                            }
                        }

                        if(strike != n[l].strike || ball != n[l].ball) {
                            result = false;
                            break;
                        }
                    }
                    if(result) {
                        count++;
                    }
                    
                }
            }
        }
        System.out.print(count);
    
    }
}