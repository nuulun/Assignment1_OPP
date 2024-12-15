package Assignment_2;

public class Task8_2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 1;

        while (i < 100) {

            i++;
            if (i%3 == 0) {
                continue;
            }
            sum += i;

        }
        System.out.println(sum);
    }
}
