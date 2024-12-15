package Assignment_2;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();

        boolean isHigh = (temp >  37);
        boolean isLow = (temp < 36);

        if (isHigh) {
            System.out.println("body temperature is high");
        } else if (isLow) {
            System.out.println("body temperature is low");
        }
        else {
            System.out.println("body temperature is normal");
        }
    }
}
