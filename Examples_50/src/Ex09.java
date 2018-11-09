public class Ex09 {
    /*
    题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。
    例如6=1＋2＋3.编程找出1000以内的所有完数。
     */
    public static void main(String[] args) {
        for (int i = 2;i<=10000;i++){
            fun(i);
        }
    }

    private static void fun(int num) {
        int sum=1;
        StringBuilder sb = new StringBuilder();
        sb.append(num).append("=").append("1");
        for (int i=2;i<num/2+1;i++){
            if (num%i==0){
                sum+=i;
                sb.append("+").append(i);
            }
        }
        if (sum==num)
            System.out.println(sb.toString());
    }
}
