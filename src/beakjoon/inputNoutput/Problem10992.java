package beakjoon.inputNoutput;

import java.util.Scanner;

public class Problem10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {

            for (int k = 0; k < num - i - 1; k++) {
                System.out.print(" ");
            }

                System.out.print("*");
            for (int j = 0; j < i * 2 -1; j++) {
                if(i==num-1)
                    System.out.print("*");
                else
                System.out.print(" ");
            }
            if (i != 0)
            System.out.print("*");

            System.out.println();
        }
    }

}
