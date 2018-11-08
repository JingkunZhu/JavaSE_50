import java.util.Scanner;

public class Ex04 {
    /*
    题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
     */
    public static void main(String[] args) {
        System.out.print("输入要被质因数的正整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder(num + "=");
        wc:
        while (true) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    sb.append(i).append("*");
                    num = num / i;
                    continue wc; //如果执行了if语句，表明质因数分解了一次，则改变num后继续下次外层循环
                }
            }
            sb.append(num); //for循环结束表明没有可以分解的，则加上最后剩下的数字后break
            break;
        }
        System.out.println(sb.toString());
    }
}
