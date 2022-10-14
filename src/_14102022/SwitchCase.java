package _14102022;

public class SwitchCase {
    int num1;
    int num2;

    String operation;

    public static double getResult(int num1, int num2, String operation) {
        int result = 0;
        switch (operation) {
            case ("+"):
                result = num1 + num2;
                break;
            case ("*"):
                result = num1 * num2;
                break;
            case ("-"):
                result = num1 - num2;
            case ("/"):
                result = num1 / num2;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getResult(10, 10, "*"));
    }
}
