import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.print("Enter the month number: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int result = fun(month);
        System.out.println("Amount: " + result);
    }

    private static int fun(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        return fun(month - 1) + fun(month - 2);
    }
}
