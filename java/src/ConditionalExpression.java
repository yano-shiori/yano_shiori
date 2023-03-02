import java.util.Random;

public class ConditionalExpression {

	public static void main(String[] args) {

		boolean rain = false;
		if (rain) {
			System.out.println("DVDを見ます。");
		} else {
			System.out.println("外で遊びます。");
		}

		String name = "山田花子";
		Random rnd = new Random();
		int score = rnd.nextInt(101);

		if (score <= 40) {
			System.out.println(name + "さんは" + score + "点です。もう少し頑張りましょう。");
		} else if (score >= 40 && score <= 60) {
			System.out.println(name + "さんは" + score + "点です。もう少しでした。");
		} else if (score >= 60 && score <= 80) {
			System.out.println(name + "さんは" + score + "点です。よくできました。");
		} else {
			System.out.println(name + "さんは" + score + "点です。たいへんよくできました。");
		}

		int isTired = 0;
		String study = "カリキュラム";
		if (isTired == 0) {
			System.out.println("私はとても元気です。");
		} else {
			System.out.println("私は疲れています。");
		}

		String play = (isTired == 0) ? (study + "を続けます。" ): "";
		System.out.println(play);
	}

}
