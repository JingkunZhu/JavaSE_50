import java.math.BigInteger;
import java.util.Scanner;


public class Ex08 {
    /*
    题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
    例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
     */
    public static void main(String[] args) {
        System.out.println("Enter the value of a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the count: ");
        int n = sc.nextInt();
        fun(a, n);
    }

    private static void fun(int a, int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        BigInteger sum = new BigInteger("0"); //为了能够计算更大的数，这里采取了BigInteger
        BigInteger m = new BigInteger(String.valueOf(a));
        for (int i = 1; i <= n; i++) {
            if (i != 1) {
                m=m.add(new BigInteger(String.valueOf((long) (a * Math.pow(10, i - 1))))); //此处代码可以改进来适应更大的数字
                sb.append("+").append(m.toString());
            }
            sum=sum.add(new BigInteger(String.valueOf(m)));
        }
        sb.append("=").append(sum.toString());
        System.out.println(sb.toString());
    }
}
