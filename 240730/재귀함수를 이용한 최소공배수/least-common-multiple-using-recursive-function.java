import java.util.Scanner;
public class Main {
    public static int commonNumber(int[] arr, int n, int common, int cnt) {
        
        for(int i = 0; i < n; i++){
            if(common % arr[i] == 0) { //최소 공배수가 배열로 나눠지면 cnt++
                cnt++;
            }
        }
        if(cnt == n) { // cnt 가 배열의 갯수와 같아지면 최소공배수 반환
                return common;
        }
        cnt = 0; //루프 다 돌았으면 카운트 0으로 초기화
        return commonNumber(arr, n, (common + 1), cnt); // 최소 공배수 1씩 늘려가면서 재귀
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 갯수
        int arr[] = new int[n]; // 배열
        int common = 0; // 최소공배수
        int cnt = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); // 최소공배수 초기화
            if(common < arr[i]){ // 배열중에 제일 큰 걸로 최소공배수 초기화
                common = arr[i];
            }
        }
        System.out.print(commonNumber(arr, n, common, cnt));
    }
}