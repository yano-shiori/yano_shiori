package vehicle;

public class Person {
    // �C���X�^���X�t�B�[���h���`
    String name;
    int age;
    double height;
    double weight;
    private String fName;

    private static int counter;

    // �R���X�g���N�^���`���C���X�^���X�t�B�[���h�ɒl���Z�b�g
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
        System.out.println("���O��" + this.name + "�ł�");
        System.out.println("�N��" + this.age + "�ł�");
        System.out.println("BMI��" + bmi() + "�ł�");
    }

    public void buy(Car car) {
        car.setOwner(this.fullName());
        System.out.println(car.getOwner() + "���w�����܂���");
    }

    public void buy(Bicycle bicycle) {
        bicycle.setOwner(this.fullName());
        System.out.println(bicycle.getOwner() + "���w�����܂���");
    }
}