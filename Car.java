class Car {
  private String name;
  private String brand;
  private String model;
  private double basePriceOfDay;
  private boolean isAvailable;
  //remove the Argument is isAvailable in the Constractor
  public Car(String name,String brand, String model , double basePriceOfDay){
    this.name = name;
    this.brand = brand;
    this.model = model;
    this.basePriceOfDay = basePriceOfDay;
    //default set the true isAvailable
    this.isAvailable = true;
  }
  public String getName(){
    return this.name;
  }
  public String getBrand(){
    return this.brand;
  }
  public String getModel(){
    return this.model;
  }
  public double  getBasePriceOfDay(){
    return this.basePriceOfDay;
  }
  public boolean getIsAvailable(){
    return this.isAvailable;
  }
  public void rent(){
    isAvailable = false;
  }
  public void returnCar(){
    isAvailable = true;
  }
  public double calculetorOfDay(int rentOFDay){
    return basePriceOfDay * rentOFDay;
  }
}