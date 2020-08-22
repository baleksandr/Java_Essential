package JavaEssential.HomeWork_1.Address;

public class Address {
    private int index;
    private int house;
    private int apartment;
    private String country;
    private String city;
    private String street;

    public Address ( String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}
