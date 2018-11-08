import java.util.Scanner;

public class Ex07 {
    /*
    题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
     */
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        statistics(s);
        count(s);
        statistics2(s);
    }

    //利用Character的静态方法判断，结果要比比较大小的形式准确，可以输入zjk101010 12 21 ,./鉴别
    //statistics中会出现统计错误（原因？？？）
    private static void statistics2(String s) {
        char[] chars = s.toCharArray();
        int letters = 0;
        int spaces = 0;
        int nums = 0;
        int others = 0;
        for (char c : chars) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                nums++;
            } else if (Character.isSpaceChar(c)) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("letters: " + letters + ", nums: " + nums + ", spaces: " + spaces + ", others: " + others);
    }

    private static void statistics(String s) {
        char[] chars = s.toCharArray();
        int letters = 0;
        int spaces = 0;
        int nums = 0;
        int others = 0;
        for (char c : chars) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) letters++;
            else if (c == 32) spaces++;
            else if (c >= '1' && c <= '9') nums++;
            else others++;
        }
        System.out.println("letters: " + letters + ", nums: " + nums + ", spaces: " + spaces + ", others: " + others);
    }

    //利用regex正则表达式
    private static void count(String str) {
        String E1 = "[\u4e00-\u9fa5]";//汉字
        String E2 = "[a-zA-Z]";
        String E3 = "[0-9]";
        String E4 = "\\s";//空格
        int countChinese = 0;
        int countLetter = 0;
        int countNumber = 0;
        int countSpace = 0;
        int countOther = 0;
        char[] array_Char = str.toCharArray();//将字符串转化为字符数组
        String[] array_String = new String[array_Char.length];//汉字只能作为字符串处理
        for (int i = 0; i < array_Char.length; i++)
            array_String[i] = String.valueOf(array_Char[i]);
        //遍历字符串数组中的元素
        for (String s : array_String) {
            if (s.matches(E1))
                countChinese++;
            else if (s.matches(E2))
                countLetter++;
            else if (s.matches(E3))
                countNumber++;
            else if (s.matches(E4))
                countSpace++;
            else
                countOther++;
        }
        System.out.println("输入的汉字个数：" + countChinese);
        System.out.println("输入的字母个数：" + countLetter);
        System.out.println("输入的数字个数：" + countNumber);
        System.out.println("输入的空格个数：" + countSpace);
        System.out.println("输入的其它字符个数：" + countSpace);
    }

}
