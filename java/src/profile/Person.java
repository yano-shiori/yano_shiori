package profile;

class Person {
    // 1.30, 1.32, 1.33
    
    public static int count = 0;
    public String firstName;
    public int age;
    public double height, weight;
    public String lastName;

    Person(String firstName, String lastName, int age, double height, double weight) {
        Person.count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String fullName() {
        return this.firstName + this.lastName;
    }

    public void print() {
        System.out.println("名前は" + this.fullName() + "です");
        System.out.println("年は" + this.age + "です");
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }

    public static void printCount(){
    System.out.println("合計" + Person.count + "人です");
    }
}