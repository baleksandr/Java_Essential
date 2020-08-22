package JavaEssential.HomeWork_1.Address;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Ukraine", "Kyev", "Hreshatik");
        address.setIndex(18992);
        address.setHouse(4);
        address.setApartment(4);

        System.out.println("Index: " + address.getIndex() + "\nCountry: " + address.getCountry() + "\nCity: " + address.getCity() + "\nStreet: " + address.getStreet() +
                "\nHouse: " + address.getHouse() + "\nApartment: " + address.getApartment());

    }
}