package Assignment_2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();

        if (age >= 18 && age <= 28) {
           System.out.println(name + ", come to the military registration and enlistment office");
        }

    }


}
