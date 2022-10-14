package _14102022;

public class WhileEx {
    public static void main(String[] args) {
        int count = 0;
        int digit = 1;

        while (count < 11) {
            System.out.println(digit * digit);
            digit++;
            count++;
        }
    }
}