import java.util.Scanner;

public class Ex05 {
    /*
    题目：利用条件运算符的嵌套来完成此题：
    学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
     */
    public static void main(String[] args) {
        System.out.print("Enter the score: ");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        System.out.println("Grade: " + getGrade(score));
    }

    private static String getGrade(double score) {
        return score >= 60 ? (score >= 90 ? "A" : "B") : "C"; //条件运算符
    }
}
