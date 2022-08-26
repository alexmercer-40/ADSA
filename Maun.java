
import java.util.Arrays;
import java.util.Scanner;
public class Maun {
    

    static int c;


    public static void main(String[] args)
    {
        c = 0;
        // System.out.print("Enter N : ");
        // int n = (new Scanner(System.in)).nextInt();
        // for (int i = 0; i < n; i++)
        //     print(1, n, i, "");
        // print(8, 9, 2, "");
        
        // System.out.println("The count is : " + c);
        System.out.println(Count(2,8,9));


    }


    static int Count(int N, int L, int R)
{
     
    // Stores all DP-states
    int[][] dp = new int[N][R - L + 1];
     
    // Stores the result
    int ans = 0;
 
    // Traverse the range [0, N]
    for(int i = 0; i < N; i++)
    {
        dp[i][0] = 1;
    }
     
    // Traverse the range [1, R - L]
    for(int i = 1; i < dp[0].length; i++)
    {
         
        // Update dp[i][j]
        dp[0][i] = dp[0][i - 1] + 1;
    }
 
    // Assign dp[0][R-L] to ans
    ans = dp[0][R - L];
 
    // Traverse the range [1, N]
    for(int i = 1; i < N; i++)
    {
         
        // Traverse the range [1, R - L]
        for(int j = 1; j < dp[0].length; j++)
        {
             
            // Update dp[i][j]
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
 
        // Increment ans by dp[i-1][j]
        ans += dp[i][R - L];
    }
 
    // Return ans
    return ans;
}


    private static void print(int s, int n, int x, String p)
    {
        if (x == 0)
            for (int i = s; i <= n; i++) {
                System.out.println(p + i);
                c++;
            }
        else
            for (int i = s; i <= n - x; i++)
                print(i + 1, n, x - 1, p + i + " ");
    }
}
