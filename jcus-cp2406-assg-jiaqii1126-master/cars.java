public class Car {

    String name;
    int position;
    Road current_park_car;

    public Car(String name, int position, Road current_park_car) {

        this.name = name;
        this.position = position;
        this.current_park_car = current_park_car;
    }

    public void movement() {

        this.position += 1;
    }
}