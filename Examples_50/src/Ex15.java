import java.util.Scanner;

public class Ex15 {
    /*
    题目：输入三个整数x,y,z，请把这三个数由小到大输出。
     */
    public static void main(String[] args) {
        System.out.println("输入三个整数：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("结果：" + sort(x, y, z));
    }

    private static String sort(int x, int y, int z) {
        int temp;
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }
        if (x > z) {
            temp = x;
            x = z;
            z = temp;
        }
        if (y > z) {
            temp = y;
            y = z;
            z = temp;
        }
        return x + "," + y + "," + z;
    }
}
