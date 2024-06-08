public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("C001", "Toyta", "Tabera", 150);
        Car car2 = new Car("C002", "Maroti", "SUV", 180);
        Car car3 = new Car("C003", "TATA", "Thar", 200);
        Car car4 = new Car("C004", "swift", "farari", 250);
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        carRentalSystem.addCar(car1);
        carRentalSystem.addCar(car2);
        carRentalSystem.addCar(car3);
        carRentalSystem.addCar(car4);

        carRentalSystem.main();
    }
}
