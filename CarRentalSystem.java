import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CarRentalSystem {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;
    public CarRentalSystem(){
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }

    public void addCar(Car car){
        this.cars.add(car);
    }
    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void addRentals(Car car , Customer customer , int days){
        if(car.getIsAvailable()){
            car.rent();
            rentals.add(new Rental(car,customer,days));
            System.out.println("Car is Reneded ");
        }
        else {
            System.out.println("Car is not Available ");
        }
    }
    public void returnCars(Car car){
        Rental removeRental = null;
        for(Rental rental : rentals){
            if(rental.getCar() == car){
                removeRental = rental;
                car.returnCar();
            }

        }
        if(removeRental != null){
            rentals.remove(removeRental);
            System.out.println("Car is Succesfully Rended: ");
        }
        else{
            System.out.println("Car is not rented ");
        }

    }
    public void main(){
        Scanner in = new Scanner(System.in);
        while (true) { 
            System.out.println("++++++++ Welcome Car Rent System ++++++++++");   
            System.out.println("1 Rent a Car");
            System.out.println("2 Return a Car");
            System.out.println("3 Exit ");

            System.out.print("Choose a any Number Options: ");
            int choose = in.nextInt();

            if(choose == 1){
                System.out.println("1 Rent a Car");
                System.out.print("Enter your Name: ");
                String customerName = in.next();
                System.out.println("Availeble Cars: ");
                for(Car car : cars){
                    System.out.printf("Car ID %s  - %s %s ",car.getID(),car.getBrand(),car.getModel());

                }
                System.out.print("Enter car ID you want to rent a car: ");
                String carID = in.next();
                System.out.print("Enter the number of Days to rent a Car: ");
                int rentDays = in.nextInt();

                System.out.println("== Rental Information ==");
                
            }
            else if(choose == 2){

            }
            else{
                System.out.println("Thank of using Car Rent System ");
            }
        }
    }
}
