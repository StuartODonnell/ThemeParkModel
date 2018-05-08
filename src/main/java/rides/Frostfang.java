package rides;


public class Frostfang extends Ride{

    private String name;
    private int minHeight;
    private int minAge;
    private double admissionPrice;

    public Frostfang(String name, int minHeight, int minAge, double admissionPrice) {
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