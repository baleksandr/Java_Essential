package je_HW_5.Exersise_2;


public class Devise {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Devise(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String toString() {
        return " manufacturer = " + manufacturer +  ", price = " + price + ", serialNumber = " + serialNumber;
    }

    @Override
    public int hashCode() {
        int result = 37;

        result = 37 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 37 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        result = 37 * result + Float.floatToIntBits(price);

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() == obj.getClass()) {
            Devise devise = (Devise) obj;
            boolean manufacturer = this.manufacturer.equals(devise.getManufacturer());
            boolean serialNumber = this.serialNumber == devise.getSerialNumber();
            boolean price = this.price == devise.getPrice();

            return manufacturer && serialNumber && price;
        }
        return false;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}