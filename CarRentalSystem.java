import java.util.ArrayList;
import java.util.List;

class CarRentalSystem {
    private List<Car> car;
    private List<Customer> customers;
    private List<Rental> rentals;
    public CarRentalSystem(){
        this.car = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }

    public void addCar(Car car){
        this.car.add(car);
    }
    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void addRentals(Car car , Customer customer , int days){
        if(car.getIsAvailable()){
            car.rent();
            System.out.println("Car is Reneded ");
        }
        else {
            System.out.println("Car is not Available ");
        }
    }
}
