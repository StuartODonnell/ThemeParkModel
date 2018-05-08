package rides;

import customers.Customer;

import java.util.ArrayList;

public class Giantsbane extends Ride{

    private String name;
    private int minHeight;
    private int minAge;
    private double admissionPrice;


    public Giantsbane(String name, int minHeight, int minAge, double admissionPrice) {
        super(minHeight, minAge, admissionPrice);
        this.name = name;
        this.minHeight = minHeight;
        this.minAge = minAge;
        this.admissionPrice = admissionPrice;
    }

    public String getName() {
        return name;
    }

    public String admitCustomer(){
        return "Customer has been admitted to " + this.name;
    }



}

