
import java.util.*;
public class fabonacci {
    public static int fab(int n){
        // base case
        if(n == 0 || n ==1) return n;
        return fab(n-1)+fab(n-2);
    }

    public static void main(String[] argv){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fab(n));    
    }
}
