import java.util.*;

public class _01_A1903_Halloumi_Boxes{
    public static boolean checksort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while(t-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();

            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = in.nextInt();
            }

            boolean sortcheck = checksort(arr);

            if(sortcheck){
                System.out.println("YES") ;
            }else{
                if(k >= 2){
                    System.out.println("YES") ;
                }else{
                    System.out.println("NO") ;
                }
            }
        }
    }
}