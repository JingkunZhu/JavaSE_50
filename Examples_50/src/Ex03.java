public class Ex03 {
    /*
    题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
    其各位数字立方和等于该数本身。
    例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
     */
    public static void main(String[] args) {
        int count = 0;
        System.out.print("水仙花数有： ");
        for (int i = 100; i <= 999; i++) {
            if (isSatisfied(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("共" + count + "个");
    }

    private static boolean isSatisfied(int i) {
        // 定义个位、十位、百位数
        int ge = i % 10;
        int shi = i / 10 % 10;
        int bai = i / 100;
        // 利用Math中的pow方法进行三次方运算，注意这里会转型为double
        return i == Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
    }
}
