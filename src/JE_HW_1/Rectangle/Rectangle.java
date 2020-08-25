package JE_HW_1.Rectangle;

public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle() {
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void areaCalculator() {
        System.out.println("Площадь прямоугольника = " + (side1 * side2));
    }

    public void perimeterCalculator() {
        System.out.println("Периметра прямоугольника = " + (2 * (side1 + side2)));
    }
}
