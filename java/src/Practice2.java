public class Practice2 {
    public static void main(String[] args) {
        /*
         * 問題.for文を使用して九九の計算を出力してください。
         * ※出力例 1×1=1 1×2=2…1×9=9
         * 2×1=2 2×2=4…2×9=18
         * ・
         * ・
         * ・
         * 9×1=9 9×2=18…9×9=81
         */
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : arr) {
            for (int j : arr) {
                System.out.print(String.valueOf(i) + "x" + String.valueOf(j) + "=" +(i*j) + " ");
            }
            System.out.println();
        }
    }
}
