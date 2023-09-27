public class Customer {

    private static int counter = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private Integer customerDiscount;
    private Foodable foodVoucher;

    public Customer(String firstName, String lastName, String email, String deliveryAddress, CustomerType customerType, Integer customerDiscount) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
        this.foodVoucher = null;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Integer getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(Integer customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public Foodable getFoodVoucher() {
        return foodVoucher;
    }

    public void setFoodVoucher(Foodable foodVoucher) {
        this.foodVoucher = foodVoucher;
    }
    public void takeFoodVoucher(){
        this.foodVoucher.takeFoodVoucher();
    }
}
