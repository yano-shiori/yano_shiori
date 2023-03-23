import java.util.Random;

public class Method {
    // 1.17 ~ 1.18
    public static void main(String[] args) {
        // Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を呼び出してください。
        greeting();

        // Q2：引数として整数を渡すと+1してメソッド（関数）関数を呼び出してコンソールに出力してください。
        System.out.println(plus(3));

        // Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
        System.out.println(tmb(2, 8));

        // Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
        System.out.println(tmb2(1.2, 0.3));

        // Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）
        // を呼び出して、ループ文を用いてそれぞれの数をコンソールに出力してください。
        // Q6：Q5で作成した関数を用いて、配列の要素の平均値を返すメソッド（関数）を呼び出してコンソールに出力してください。
        System.out.println();

        int[] q5 = rnd(3);
        System.out.println("[Q5]配列の中身");
        for (int all: q5) {
            System.out.println(all);
        }
        System.out.println("[Q6]配列の要素の平均値");
        int q6 = avg(q5);
        System.out.println(q6);
    }

    public static void greeting() {
        System.out.println("Hello Java");
    }

    public static int plus(int a) {
        return a + 1;
    }

    public static int tmb(int b, int c) {
        return b * c;
    }

    public static double tmb2(double d, double e) {
        return d * e;
    }

    public static int[] rnd(int f) {
        int arr[] = new int[f];
        Random rnd2 = new Random();
        for(int i = 0; i < f; i++) {
            int value = rnd2.nextInt(101) + 1;
            arr[i] = value;
        }
        return arr;
    }

    public static int avg(int[] q5) {
        int sum = 0;
        for (int i=0; i < q5.length; i++) {
            sum += q5[i];
        }
        int num = sum / q5.length;
        return num;
    }
}
