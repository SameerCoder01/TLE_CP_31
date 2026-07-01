import java.util.*;

public class _07_1866A_Ambitious_Kid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int num = Math.abs(in.nextInt());
        for(int i=1; i<=n-1; i++){
            int number = Math.abs(in.nextInt());
            if(number < num){
                num = number;
            }

        }
        System.out.print(num);


    }
}
