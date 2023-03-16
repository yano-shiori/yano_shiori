import java.util.Scanner;

public class AnimalBook {
    // 1.26~1.28
    /*
     *
     * コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
     * ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
     *
     * コンソール出力結果
     *
     * コンソールに文字を入力してください
     * 動物名：ライオン
     * 体長：2.1m
     * 速度：80km/h
     * 学名：パンテラ レオ
     *
     * 動物名：ゾウ
     * 体長：3.2m
     * 速度：40km/h
     * 学名：ロキソドンタ・サイクロティス
     *
     * 動物名：パンダ
     * 体長：1.9m
     * 速度：30km/h
     * 学名：アイルロポダ・メラノレウカ
     *
     * 動物名：チンパンジー
     * 体長：0.94m
     * 速度：25km/h
     * 学名：パン・トゥログロディテス
     *
     * 動物名：シマウマ
     * 体長：2.4m
     * 速度：65km/h
     * 学名：チャップマンシマウマ
     *
     * 動物名：インコ
     * 体長：0.1m
     * 速度：50km/h
     * 学名：不明
     */
    public static void main(String[] args) {
        System.out.println("「動物名:体長:速度」と入力してください");
        Scanner scan = new Scanner(System.in);
        String strInput = scan.nextLine();
        String[] details = strInput.split(":");
        scan.close();

        System.out.println("動物名:" + details[0]);
        System.out.println("体長:" + details[1] + "m");
        System.out.println("速度:" + details[2] + "km/h");

        String scName = "";
        if (details[0] == "ライオン") {
            scName = "パンテラ レオ";
        } else if (details[0] == "ゾウ") {
            scName = "ロキソドンタ・サイクロティス";
        } else if (details[0] == "パンダ") {
            scName = "アイルロポダ・メラノレウカ";
        } else if (details[0] == "チンパンジー") {
            scName = "パン・トゥログロディテス";
        } else if (details[0] == "シマウマ") {
            scName = "チャップマンシマウマ";
        } else if (details[0] == "インコ") {
            scName = "不明";
        } else {
            scName = "不明";
        }

        System.out.println("学名:" + scName);
    }
}