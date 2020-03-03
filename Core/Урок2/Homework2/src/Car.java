public class Car {
    private Helm helm;
    private Wheel wheel;
    private CarBody carBody;
    private String model;
    private float price;

    public Car(Helm helm, Wheel wheel, CarBody carBody, String model, float price) {
        this.helm = helm;
        this.wheel = wheel;
        this.carBody = carBody;
        this.model = model;
        this.price = price;
    }

    public Helm getHelm() {
        return helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public String getModel() {
        return model;
    }

    public float getPrice() {
        return price;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car helm diameter = " + helm.getDiameter() + ", Car helm type = " + helm.getType() +";\n" +
                "Car wheel model = " + wheel.getModel() + ", Car wheel size = " + wheel.getSize() + ", Car wheel price = " + wheel.getPrice() +";\n" +
                "Car body type = " + carBody.getType() + ", Car body weight = " + carBody.getWeight() + ", Car body count of doors= " + carBody.getCountOfDoors() +";\n" +
                "Car model='" + model + '\n' +
                "Car price=" + price;
    }

    void priceChange(float price)
    {
        System.out.println("Price of car changed");
        this.price = this.price + price;
    }
}






