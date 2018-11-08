import java.util.Scanner;

public class Ex01 {
    /*
    题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
    小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
    问每个月的兔子对数为多少？
     */
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



