public class Ex10 {
    /*
    题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
    再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
     */
    public static void main(String[] args) {
        fun(100, 10);
    }

    private static void fun(double height, int count) {
        double sum = 0;
        for (int i = 1; i <= count; i++) {
            if (i == 1) {
                sum += height;
                continue;
            }
            height /= 2;
            sum += height * 2;
        }
        System.out.println("第" + count + "次落地时共经过" + sum + "米");
        System.out.println("第" + count + "次反弹" + height / 2 + "米");
    }

}
