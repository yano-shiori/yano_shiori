public class Zoo {
    // 1.23
    public static void main(String[] args) {
        Animal2 lion = new Animal2("ライオン", 2.1, 80);
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getHeight() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}

class Animal2 {
    private String name;
    private double height;
    private int speed;

    public Animal2(String name, double height, int speed) {
        this.name = name;
        this.height = height;
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }
    public double getHeight() {
        return this.height;
    }
    public int getSpeed() {
        return this.speed;
    }
}
