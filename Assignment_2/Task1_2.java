package Assignment_2;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp < 0) {
            System.out.println("it’s cold outside.");
        }
        else {
            System.out.println("it’s warm outside.");
        }
    }
}
