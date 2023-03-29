package vehicle;

public class Vehicle {
    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}

class Car extends Vehicle {

}

class Bicycle extends Vehicle {

}