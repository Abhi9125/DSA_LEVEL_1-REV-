// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Don't change the signature of power function.

// Note1 -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high.

// Note2 -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 1 <= x <= 10
// 0 <= n <= 9

// Format
// Input
// A number x
// A number n

// Output
// x raised to the power n

// Example
// Sample Input

// 2
// 5

// Sample Output
// 32

// ------------------------
import java.io.*;
import java.util.*;

public class Power_logarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        // base case
        if(n == 0) return 1;

        int powerOfNby2 = power(x,n/2);

        int ans = powerOfNby2 * powerOfNby2;

        if(n % 2 != 0){
            int fans = ans * x;
            return fans;
        }

        return ans;
     }

}