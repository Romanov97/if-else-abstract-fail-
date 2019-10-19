package square;

import abs.AbstractClass;

public class Square extends AbstractClass {
    private double sideSquare;

    public double getSideSquare() {
        return sideSquare;
    }

    public void setSideSquare(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    @Override
    public double getArea() {
        return sideSquare * sideSquare;

    }
}
