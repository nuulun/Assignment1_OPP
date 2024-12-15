package Assignment_2;

import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstInt, secondInt;
        String temp;
        boolean flag = true;

        while (flag) {
            temp = sc.next();
            if (temp.equals("ENTER")) {
                flag = false;
            }
            else {
                firstInt = Integer.parseInt(temp);
                secondInt = sc.nextInt();
                int sum = firstInt + secondInt;
                System.out.println(sum);
            }
        }
    }
}
