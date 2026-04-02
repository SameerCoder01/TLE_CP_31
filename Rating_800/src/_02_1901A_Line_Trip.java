import java.util.*;

public class _02_1901A_Line_Trip{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            int x = in.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = in.nextInt();
            }

            // For first journey : 0 --> x
            int d = arr[0];
            for(int i=1; i<n; i++){
                int num = arr[i] - arr[i-1];
                if(num > d){
                    d = num;
                }
            }
            if(2*(x-arr[n-1]) > d){
                d = 2*(x-arr[n-1]);
            }

            // For reverse journey : x --> 0
            for(int i=n-1; i>0; i--){
                if(Math.abs(arr[i] - arr[i-1]) > d){
                    d = Math.abs(arr[i] - arr[i-1]);
                }
            }



            System.out.println(d);
        }
    }
}