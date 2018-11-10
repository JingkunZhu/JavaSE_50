public class Ex11 {
    /*
    题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去掉不满足条件的排列。
    */
    public static void main(String[] args) {
        int[] book = new int[5];
        int[] a = new int[4];
        dfs(a, book, 0);
        System.out.println();
        /* ********************************************************************** */
//下面采用的是暴力的枚举方法，需要for的不断嵌套和最后的判断，对于该题不算特别复杂，但对于数据量和判断条件多的情况就不适用了
        int count = 0;
        int n;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (j == i)
                    continue;
                for (int k = 1; k < 5; k++) {
                    if (k != i && k != j) {
                        n = i * 100 + j * 10 + k;
                        System.out.print(n + " ");
                        if ((++count) % 5 == 0)
                            System.out.println();
                    }
                }
            }
        }
        System.out.println();
        System.out.println("符合条件的数共：" + count + "个");

    }

    //下面采取了深度优先算法
    private static void dfs(int[] a, int[] book, int step) {
        if (step == 3) {
            for (int i = 0; i <= 2; i++) {
                System.out.print(a[i]);
            }
            System.out.print(" ");
            return;
        }
        for (int i = 1; i <= 4; i++) {
            if (book[i] == 0) {
                a[step] = i;
                book[i] = 1;
                dfs(a, book, step + 1);
                book[i] = 0;
            }
        }
    }
}
