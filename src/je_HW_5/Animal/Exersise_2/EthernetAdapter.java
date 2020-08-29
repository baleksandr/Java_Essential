package je_HW_5.Animal.Exersise_2;

public class EthernetAdapter {
    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return " speed = " + speed +  ", mac = " + mac;
    }

    @Override
    public int hashCode() {
        int result = 37;

        result = 37 * result + (mac != null ? mac.hashCode() : 0);
        result = 37 * result + speed;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this.getClass() == obj.getClass()) {
            EthernetAdapter ethernetAdapter = (EthernetAdapter) obj;
            boolean speed = this.speed == ethernetAdapter.getSpeed();
            boolean mac = this.mac == ethernetAdapter.getMac();

            return speed && mac;
        }
        return false;
    }


    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }
}