public class Ex02 {
    /*
    题目：判断101-200之间有多少个素数，并输出所有素数。
     */
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Prime numbers between 101 and 200: ");
        for (int i = 101; i <= 200; i++) {
            if (isPrime(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "Count: " + count);
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
