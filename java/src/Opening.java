import java.util.Random;
import java.util.Scanner;

public class Opening {
    // 1.25

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

/*
 *
 * 名前を入力したら下記がコンソールに出力されるように作ってください
 * 条件：数値は毎回変わるように作ってください
 * サブクラスを使用してください
 * メソッドのオーバーライドを使用してください
 * superクラスを使用してください
 * getterとsetterを使用してください
 * Projectを2つ作ってメインと処理を分けてください
 * 命名する場合は規則にのっとってください
 * コンストラクタを使用してください
 *
 * こんにちは 「 名前 」 さん
 * ステータス
 * HP：849
 * MP：862
 * 攻撃力：375
 * 素早さ：937
 * 防御力：24
 *
 * さあ冒険に出かけよう！
 *
 */