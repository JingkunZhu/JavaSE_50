import java.util.Scanner;

public class Ex12 {
    /*
    题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
    利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
    20万到40万之间时，高于20万元的部分，可提成5%；
    40万到60万之间时高于40万元的部分，可提成3%；
    60万到100万之间时，高于60万元的部分，可提成1.5%，
    高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，
    求应发放奖金总数？
    */
    public static void main(String[] args) {
        System.out.print("输入利润I：");
        Scanner sc = new Scanner(System.in);
        long profit = sc.nextLong();
        System.out.println("应发奖金总数为：" + bonus(profit));
    }

    private static long bonus(long profit) {
        long prize = 0;
        long profitSub = profit;
        if (profit > 1000000) {
            prize += (profitSub - 1000000) * 0.01;
            profitSub = 1000000;
        }
        if (profit > 600000) {
            prize += (profitSub - 600000) * 0.015;
            profitSub = 600000;
        }
        if (profit > 400000) {
            prize += (profitSub - 400000) * 0.03;
            profitSub = 400000;
        }
        if (profit > 200000) {
            prize += (profitSub - 200000) * 0.05;
            profitSub = 200000;
        }
        if (profit > 100000) {
            prize += (profitSub - 100000) * 0.075;
            profitSub = 100000;
        }
        if (profit <= 100000) {
            prize += profitSub * 0.1;
        }
        return prize;
    }
}
