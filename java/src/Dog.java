
public class Dog {
	// 1.19_1
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name;

	// Q2：フィールドに動物の数の変数を定義してください。
	int count;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	void setName() {
		name = "犬";
		System.out.println(name);
	}
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	void setCount(int count2) {
		count = count2;
		System.out.println(count);
	}
}
