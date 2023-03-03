
public class Array2 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        int b[] = a;
        System.out.println(b[2]);

        a[2] = 10;
        System.out.println(a[2]);

        System.out.println("配列aの要素数は、" + a.length + "です。");
    }
}
