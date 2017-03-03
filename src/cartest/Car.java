
package cartest;

public class Car {
    private String model;
    private int year;
    private double price;
    
    public Car(){
        
        
    }
public void setYear(int year){
    if(year < 1900){
        this.year = 1990;
    System.out.println("car year most be at least 1990");
    }
    else
    this.year = year;
}
    public void setPrice(double price){
        if(price <= 0){
            this.price = 0;
            System.out.println("enter a positive price");
        }
        else 
            this.price = price;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        System.out.println("Car Information: ");
        return " model: " + model + ", year: " + year + ", price: " + price + "";
    }
}
    


