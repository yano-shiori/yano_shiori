
import java.util.Random;

public class Variable2 {

	public static void main(String[] args) {
		int x = 3;
		x *= 20;
		System.out.println(x);

		int i = 100;
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);

		Random rand = new Random();
		int age = rand.nextInt(62) + 7;
		System.out.println("あなたの年齢を予想します。");
		System.out.println("あなたの年齢はおそらく" + age + "歳ですね？");
	}
	
}
