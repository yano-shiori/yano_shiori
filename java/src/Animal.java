import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Animal {
	// 1.19_2
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.setName();
		dog1.setCount(5);

		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fDate = sFormat.format(date);
		System.out.println(fDate);
	}
}
