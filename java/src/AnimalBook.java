import java.util.Scanner;

public class AnimalBook {
    //1.26~1.28
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
        } else if(details[0] == "ゾウ") {
            scName = "ロキソドンタ・サイクロティス";
        } else if(details[0] == "パンダ") {
            scName = "アイルロポダ・メラノレウカ";
        } else if(details[0] == "チンパンジー") {
            scName = "パン・トゥログロディテス";
        } else if(details[0] == "シマウマ") {
            scName = "チャップマンシマウマ";
        } else if(details[0] == "インコ") {
            scName = "不明";
        } else {
            scName = "不明";
        }

        System.out.println("学名:" + scName);
    }
}