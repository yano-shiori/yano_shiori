package country;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Country1 {
    // 1.20~1.22
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
