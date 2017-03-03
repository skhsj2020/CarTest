
package cartest;
import java.util.Scanner;
public class CarTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car obj1 = new Car();
        System.out.println("enter car information :");
        System.out.println("-----------------------");
        System.out.println("enter car model: ");
        obj1.setModel(input.next());
        System.out.println("-----------------------");
        System.out.println("enter car price: ");
        obj1.setPrice(input.nextDouble());
        System.out.println("car price " + obj1.getPrice());
        System.out.println("-----------------------");
        System.out.println("enter car year: ");
        System.out.println(input.nextInt());
        System.out.println("car year " + obj1.getYear());
        System.out.println("-----------------------");
        System.out.println(obj1.toString() + " ");
        
        
        
    }
    
}
