public class Ex13 {
    /*
    题目：一个整数，它加上100后是一个完全平方数，再加上268又是一个完全平方数，请问该数是多少？
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 100000; i++) {
            if (isSatisfied(i + 100) && isSatisfied(i + 268)) {
                System.out.println(i + " ");
            }
        }
    }

    private static boolean isSatisfied(int num) {
        return Math.floor(Math.sqrt(num)) == Math.ceil(Math.sqrt(num));
    }

}
