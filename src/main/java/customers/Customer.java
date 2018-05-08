package customers;

public class Customer {

    private String name;
    private int height;
    private int age;
    private double cash;


    public Customer(String name, int height, int age, double cash){
        this.name = name;
        this.height = height;
        this.age = age;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

//    public void spendCash(double cash){
//
//    }
}
