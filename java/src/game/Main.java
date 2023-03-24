package game;

/*
 * 1.25
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
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = Random();

        System.out.println("名前を入力してください");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();

        Hero hero = new Hero(str, arr[0], arr[1], arr[2], arr[3], arr[4]);
        hero.setName(str);
        hero.setHp(arr[0]);
        hero.setMp(arr[1]);
        hero.setCom(arr[2]);
        hero.setDex(arr[3]);
        hero.setDef(arr[4]);

        System.out.println("こんにちは、「" + hero.getName() + "さん");
        System.out.println("ステータス");
        System.out.println("HP:" + hero.getHp());
        System.out.println("MP:" + hero.getMp());
        System.out.println("攻撃力:" + hero.getCom());
        System.out.println("素早さ:" + hero.getDex());
        System.out.println("防御力" + hero.getDef());
        System.out.println("さあ冒険に出かけよう！");
    }

    public static int[] Random() {
        int arr[] = new int[5];
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            int num = rnd.nextInt(1000) + 1;
            arr[i] = num;
        }
        return arr;
    }
}