package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem8393 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int t=0;
        for(int i =n; i>0;i--){
            t=i+t;
        }
        System.out.println(t);
    }
}
