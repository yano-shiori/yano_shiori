package vehicle;

public class Main {
    // 1.30
    public static void main(String[] args) {

        Person person1 = new Person("���", "���Y");
        Person person2 = new Person("�R�c", "�Ԏq");

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.setOwner(person1.fullName());
        bicycle.setOwner(person2.fullName());

        // System.out.println(car.getOwner());
        // System.out.println(bicycle.getOwner());

        // ��蕨���w��
        person1.buy(car);
        person2.buy(bicycle);
    }
}