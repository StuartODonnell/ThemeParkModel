package rides;


import customers.Customer;

import java.util.ArrayList;

public abstract class Ride {

    int minHeight;
    int minAge;
    double admissionPrice;
    private ArrayList<Customer> customers;


    public Ride(int minHeight, int minAge, double admissionPrice) {
        this.minHeight = minHeight;
        this.minAge = minAge;
        this.admissionPrice = admissionPrice;
        this.customers = new ArrayList<>();
    }

    public int getMinHeight() {
        return minHeight;
    }


    public int getMinAge() {
        return minAge;
    }

    public double getAdmissionPrice() {
        return admissionPrice;
    }

    public int getCustomerCount(){
        return this.customers.size();
    }

    public void admitCustomer(Customer customer) {
        if (customer.getCash() >= this.admissionPrice &&
                customer.getAge() >= this.minAge &&
                customer.getHeight() >= this.minHeight)

                {
                        this.customers.add(customer);
        }
    }
}
