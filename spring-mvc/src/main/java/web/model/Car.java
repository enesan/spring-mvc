package web.model;

public class Car {

    private String model;
    private int speed;
    private int weight;

    public Car(String model, int speed, int weight) {
        this.model = model;
        this.speed = speed;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }
}
