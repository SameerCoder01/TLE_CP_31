import java.util.*;
public class _06_1877A_Goals_of_Victory {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- > 0){
            int n = in.nextInt();
            int sum = 0;
            for(int i=1; i<=n-1; i++){
                sum += in.nextInt();
            }
            System.out.println(-1*sum);
        }
    }
}
