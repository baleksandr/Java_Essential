package Pack1;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(19101, "Ukraine", "Kyev", "Hreshtik", 4, 3);


        System.out.println("Index" + address.getIndex() + "Country" + address.getCountry() + "City" + address.getCity() + "Street" + address.getStreet() +
                "House " + address.getHouse() + "Apartment " + address.getApartment());

    }
}
