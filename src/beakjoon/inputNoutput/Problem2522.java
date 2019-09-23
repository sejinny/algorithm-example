package beakjoon.inputNoutput;
import java.util.Scanner;
public class Problem2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < i + 1; k++)
                System.out.print("*");

            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int k = 0; k < num-i; k++)
                System.out.print("*");

            System.out.println();
        }
    }

}
