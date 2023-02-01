package _01_ADV_DEFINING_CLASSES.carInfo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Skoda");
        car.setModel("Octavia");
        car.setHorsepower(140);

        carInfo(car);

    }

    private static void carInfo(Car car) {
        System.out.println(String.format("The car is %s %s - %d HP",
                car.getBrand(), car.getModel(), car.getHorsepower()));
    }
}
