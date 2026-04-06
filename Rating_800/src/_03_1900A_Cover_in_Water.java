import java.util.*;
public class _03_1900A_Cover_in_Water{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String str = in.next();

            if(str.contains("...")){
                System.out.println(2);
            }else{
                int count = 0;
                for(int i=0; i<n; i++){
                    if(str.charAt(i) == '.'){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}