class Car {
  private String name;
  private String brand;
  private String model;
  private double basePriceOfDay;
  private boolean isAvailable;

  public Car(String name,String brand, String model , double basePriceOfDay , boolean isAvailable){
    this.name = name;
    this.brand = brand;
    this.model = model;
    this.basePriceOfDay = basePriceOfDay;
    this.isAvailable = isAvailable;
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
  public void setBasePriceOfDay(double basePriceOfDay){
    this.basePriceOfDay = basePriceOfDay;
  }
  public void setIsAvailable(boolean IsAvailable){
    this.isAvailable = IsAvailable;
  }
}