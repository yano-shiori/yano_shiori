import java.util.Random;
import java.util.Scanner;

public class Opening {
    public static void main(String[] args) {
        // キーボード入力
        System.out.println("名前を入力してください");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("こんにちは、 「" + str + "」 さん");
        scan.close();

        // ステータス
        System.out.println("ステータス");
        String points[] = { "HP", "MP", "攻撃力", "素早さ", "防御力" };
        int max = points.length;

        // 乱数生成ループ
        int arr[] = new int[max];
        Random rnd = new Random();
        for (int i = 0; i < max; i++) {
            int num = rnd.nextInt(1000) + 1;
            arr[i] = num;
            System.out.println(points[i] + ":" + arr[i]);
        }
    }
}