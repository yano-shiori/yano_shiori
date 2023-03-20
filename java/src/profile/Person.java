package profile;

public class Person {
    // 1.30
    // インスタンスフィールドを定義
    public String name;
    public int age;
    public double height;
    public double weight;
    public static int count = 0;

    // コンストラクタを定義しインスタンスフィールドに値をセット
    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;
    }

    public static double bmi(double height, double weight) {
        return weight / height / height;
    }

    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + bmi(this.height, this.weight) + "です");
    }
}
