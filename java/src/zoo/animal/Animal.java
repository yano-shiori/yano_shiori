package zoo.animal;

public class Animal {
    private String name;
    private double height;
    private int speed;

    public Animal(String name, double height, int speed) {
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
