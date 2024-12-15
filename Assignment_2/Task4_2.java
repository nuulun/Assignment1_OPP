package Assignment_2;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 20 || n > 60) {
            System.out.println("you don’t have to work.");
        }
    }
}
