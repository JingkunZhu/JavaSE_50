import java.util.Scanner;

public class Ex06 {
    /*
    题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
     */
    public static void main(String[] args) {
        System.out.println("Enter 1st number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        int maxCommonDivisor = maxCommonDivisor(num1, num2);
        int minCommonMultiple = minCommonMultiple(num1, num2);
        System.out.println("Max Common Divisor: " + maxCommonDivisor);
        System.out.println("Min Common Multiple: " + minCommonMultiple);
    }

    //利用到最大公约数
    private static int minCommonMultiple(int num1, int num2) {
        int divisor = maxCommonDivisor(num1, num2);
        return divisor * (num1 / divisor) * (num2 / divisor);
    }

    //利用循环，循环至num1和num2中较小的数，若中间出现num都除尽的情况则更新divisor
    private static int maxCommonDivisor(int num1, int num2) {
        int max = num1;
        int divisor = 1;
        if (num1 == num2) return num1;
        if (num1 > num2) max = num2;
        for (int i = 2; i <= max; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                divisor = i;
            }
        }
        return divisor;
    }
}
