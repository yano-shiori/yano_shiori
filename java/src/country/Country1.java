package country;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Country1 {
    // 1.20~1.22
    /*
     *
     * 下記がコンソールに出力されるように作成してください
     *
     * こんにちは！ここは日本です！
     * この寿司はうまい
     * 寿司は和食です
     * 今の現在日時は2023/03/09 10:23:39です
     *
     * 【条件】
     * ・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
     * ・適切なファイルにフィールドで変数を必要な数作ってください。
     * ・thisを使って作成してください。
     * ・日時は今日の日付を取得してください。
     *
     */
    String country = "日本";
    String food = "寿司";
    String foodCat = "和食";

    public void hello() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        SimpleDateFormat sFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String fDate = sFormat.format(date);

        System.out.println("こんにちは！ここは" + this.country + "です。");
        System.out.println("この" + this.food + "はうまい");
        System.out.println(food + "は" + this.foodCat + "です。");

        System.out.println(fDate);
    }
}
