
public class DateTypeChange {

	public static void main(String[] args) {
		int i = 3;
		double d = i;
		System.out.println(i);
		System.out.println(d);

		double pi = 3.14;
		System.out.println(pi * 3);

		int integer = (int) pi;
		System.out.println(integer);

		double cast1 = 2 + 6.0;
		System.out.println(cast1);

		int cast2 = (int) cast1;
		System.out.println(cast2);

		// 以下更新
		// ③String型の変数を定義し、int型の変数をString型に型変換して代入
		int number3 = 3;
		String cast3 = String.valueOf(number3);
		System.out.println(cast3);

		String str = "1";
		cast2 = Integer.parseInt(str);
		System.out.println(cast2);
	}

}
