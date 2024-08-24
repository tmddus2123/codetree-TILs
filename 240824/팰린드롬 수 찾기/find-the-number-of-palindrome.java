import java.util.Scanner;

public class Main {
    public static int x, y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        x = sc.nextInt();
        y = sc.nextInt();

        int ans = 0;
        // 각 정수에 대해 
        // 팰린드롬 수인지 아닌지 여부를 판단합니다.
        for(int i = x; i <= y; i++) {
            // 정수 형태를 문자열 배열로 바꿉니다.
            String str = Integer.toString(i);

            boolean isPalindrome = true;

            // 펠린드롬 수가 되기 위해서는,
            // 거꾸로 읽어도 똑같은 수여야 합니다.
            String strReverse = "";
            for(int j = str.length() - 1; j >= 0; j--)
                strReverse += str.charAt(j);

            if(!str.equals(strReverse))
                isPalindrome = false;

            if(isPalindrome)
                ans++;
        }
        
        System.out.print(ans);
        
    }
}