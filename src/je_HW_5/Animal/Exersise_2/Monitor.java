package je_HW_5.Animal.Exersise_2;

public class Monitor extends Devise {
    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "manufacturer = " + getManufacturer() +  ", price = " + getPrice() + ", serialNumber = " + getSerialNumber()
                + ", X = " + resolutionX + ", Y = " + resolutionY;
    }

    @Override
    public int hashCode() {
        int result = 37;

        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() == obj.getClass()) {
            Monitor monitor = (Monitor) obj;
            boolean resolutionX = this.resolutionX == monitor.getResolutionX();
            boolean resolutionY = this.resolutionY == monitor.getResolutionY();

            return resolutionX && resolutionY;
        }
        return false;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }
}