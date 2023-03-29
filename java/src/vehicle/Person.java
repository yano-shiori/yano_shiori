package vehicle;

public class Person {
    // インスタンスフィールドを定義
    String name;
    int age;
    double height;
    double weight;
    private String fName;

    private static int counter;

    // コンストラクタを定義しインスタンスフィールドに値をセット
    Person(String name, String fName) {
        this.name = name;
        this.fName = fName;
    }

    public static int getNumOfInstances() {
        return counter;
    }

    public double bmi() {
        return weight / (height * height);
    }

    public String fullName() {
        return this.name + this.fName;
    }

    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + bmi() + "です");
    }

    public void buy(Car car) {
        car.setOwner(this.fullName());
        System.out.println(car.getOwner() + "が購入しました");
    }

    public void buy(Bicycle bicycle) {
        bicycle.setOwner(this.fullName());
        System.out.println(bicycle.getOwner() + "が購入しました");
    }
}