package profile;

public class Main {
    // 1.30
    public static void main(String[] args) {

        Person person1 = new Person("���", "���Y", 20, 1.7, 60);
        person1.print();

        Person person2 = new Person("�R�c", "�Ԏq", 22, 1.5, 40);
        person2.print();

        Person.printCount();
    }
}