package Demo;

public class Address
{
    public String street;
    public String zip;
    public String country;
    public String city;

    public Address(String street, String zip, String country, String city) {
        this.street = street;
        this.zip = zip;
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
