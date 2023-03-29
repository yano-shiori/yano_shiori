package vehicle;

public class Main {
    // 1.30
    public static void main(String[] args) {

        Person person1 = new Person("鈴木", "太郎");
        Person person2 = new Person("山田", "花子");

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.setOwner(person1.fullName());
        bicycle.setOwner(person2.fullName());

        // System.out.println(car.getOwner());
        // System.out.println(bicycle.getOwner());

        // 乗り物を購入
        person1.buy(car);
        person2.buy(bicycle);
    }
}