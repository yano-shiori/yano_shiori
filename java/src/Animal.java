import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Animal {
	// 1.19_2
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog1 = new Dog();
		dog1.setName();

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		dog1.setCount(5);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fDate = sFormat.format(date);
		System.out.println(fDate);
	}
}
