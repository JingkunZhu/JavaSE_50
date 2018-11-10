import java.util.Scanner;

public class Ex14 {
    /*
    题目：输入某年某月某日，判断这一天是这一年的第几天？
     */
    public static void main(String[] args) {
        System.out.println("输入年月日（格式 2018-11-9）：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] date = s.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = day;
        for (int i = 1; i < month; i++) {
            sum += arr[i];
        }
        if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && (month > 2)) {
            sum += 1;
        }
        System.out.println(year + "年" + month + "月" + day + "日，是这年的第" + sum + "天");
    }
}
