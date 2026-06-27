import java.util.Scanner;

public class _05_1878A_HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();

            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = in.nextInt();
            }

            boolean ans = false;

            for(int i=0; i<n; i++){
                if(a[i] == k){
                    ans = true;
                    break;
                }
            }
            if(ans){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
