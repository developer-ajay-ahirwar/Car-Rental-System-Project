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
           
        }
        else{
            // System.out.println("Car is not rented ");
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
                    if (car.getIsAvailable()){
                        System.out.println(car.getID() +" "+ car.getBrand()+ " " + car.getModel());
                    }
                }
                System.out.print("Enter car ID you want to rent a car: ");
                String carID = in.next().toUpperCase();
                System.out.print("Enter the number of Days to rent a Car: ");
                int rentDays = in.nextInt();
                in.nextLine();

                Customer newCustomer = new Customer(customerName,"CUS" + (customers.size() + 1));
                addCustomer(newCustomer);

                Car seletedCar = null;
                for(Car car : cars){
                    if (car.getID().equals(carID) && car.getIsAvailable()) {
                        seletedCar = car;
                        break;
                    }
                }

                if(seletedCar != null){
                    double totalprice = seletedCar.calculetorOfDay(rentDays);
                    System.out.println("\nRentel Information ");
                    System.out.println("Customer ID " + newCustomer.getCustomerID());
                    System.out.println("Customer Name " + newCustomer.getCustomerName());
                    System.out.println("Car: " + seletedCar.getBrand() + " "+ seletedCar.getModel());
                    System.out.println("Rented Days: " + rentDays);
                    System.out.println("\nTotal price of Rented Days: " + totalprice);

                    System.out.print("Comfirm Rentel: ");
                    String yAn = in.next().toLowerCase();

                    if(yAn.equalsIgnoreCase("Y")){
                        addRentals(seletedCar,newCustomer,rentDays);
                        System.out.println("Car is Successfully rented " + customerName);
                    }
                    else {
                        System.out.println("rent is Cancal");
                    }


                }
                else {
                    System.out.println("Invaild car selection ");
                }

                System.out.println("== Rental Information ==");
                
            }
            else if(choose == 2){
                System.out.println("2 Return a Car");
                System.out.print("Enter Car a CarID: ");
                String carId = in.next();

                Car carReturn = null;

                for(Car car : cars){
                    if(car.getID().equals(carId) && !car.getIsAvailable());
                    carReturn = car;
                    break;
                }
                if(carReturn != null){
                    Customer customer = null;
                    for(Rental rental : rentals){
                        if(rental.getCar() == carReturn){
                            customer = rental.getCustomer();
                            break;
                        }
                    }
                    if(customer != null){
                        returnCars(carReturn);
                        System.out.println("Car is SuccessFully Rented " + customer.getCustomerName());
                    }
                    else{
                        System.out.println("Car not rented and car Rentel informaion is missing");
                    }
                    
                }
                else{
                    System.out.println("Car Id is invaild ");
                }
            }
            else if (choose == 3){
                System.out.println("Thank of using Car Rent System ");
                break;
                
            }
            else{
                System.out.println("Invaild Option Please Input you right option:");
            }
        }
    }
}
