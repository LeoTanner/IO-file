package Demo;

import java.util.ArrayList;

public class DemoCustomerApp
{
    public static void main(String[] args) {
        Customer custom1 = new Customer(1);
        Customer custom2 = new Customer(2,new ArrayList<>());

        custom1.addAddress(new Address("Weizerstraße 1", "8010","Austria","Graz"));
        custom2.addAddress(new Address("Bachgasse 1", "8020","Austria","Graz"));
        custom1.addAddress(new Address("Siebengasse 2", "1010","Austria","Wien"));

        System.out.println("Customer1: " +custom1.toString());
        System.out.println("Customer2: " +custom2.toString());
    }

}
