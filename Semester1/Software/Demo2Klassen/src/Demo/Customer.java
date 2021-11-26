package Demo;

import java.util.ArrayList;

public class Customer
{
    public int CustomerNumber;
    public ArrayList<Address> Addresses;

    public Customer(int customerNumber) {
        CustomerNumber = customerNumber;
    }

    public void addAddress(Address a)
    {
        Addresses.add(a);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerNumber=" + CustomerNumber +
                ", Adresses=" + Addresses +
                '}';
    }
}
