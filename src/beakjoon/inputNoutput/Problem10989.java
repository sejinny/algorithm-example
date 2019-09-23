package beakjoon.inputNoutput;
import java.util.Scanner;

public class Problem10989 {
    public static void main(String[] avgs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int[] ar= new int[n];
        int ar;
        int[] ard = new int[n];
        for (int i = 0; i < n; i++) {
            ar = sc.nextInt();
            if (i == 0)
                ard[i] = ar;
            else {
                    if(ard[i-1]<=ar) {
                        ard[i] = ar;
                    }
                    else{
                        for (int k = i; k > 0; k--) {
                                    ard[k] = ard[k - 1];
                                    if (ar <= ard[k - 1]) {
                                        ard[k - 1] = ar;
                                    }
                        }
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.println(ard[i]);
    }
}
