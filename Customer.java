class Customer {
    private String customerName;
    private String customerID;

    public Customer(String customerName,String customerID){
        this.customerName = customerName;
        this.customerID = customerID;
    }

    public String getCustomerName(){
        return this.customerName;

    }
    public String getCustomerID(){
        return this.customerID;
    }

}
