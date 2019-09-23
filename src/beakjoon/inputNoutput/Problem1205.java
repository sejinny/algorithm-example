package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem1205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        if (n >= p && ar[n - 1] >= s)
            System.out.println("-1");
        if(n==0)
            System.out.println("1");
        else {
            for( int j =0; j<n;j++)
            {
                if(ar[j]<=s){
                    ar[j]=s;
                    System.out.println(j+1);
                }
            }
        }
    }
}
