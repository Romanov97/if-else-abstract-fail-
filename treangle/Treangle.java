package treangle;

import abs.AbstractClass;

public class Treangle extends AbstractClass {
    private double heightSide;
    private double treangleSideOne;

    public double getHeightSide() {
        return heightSide;
    }

    public void setHeightSide(double heightSide) {
        this.heightSide = heightSide;
    }

    public double getTreangleSideOne() {
        return treangleSideOne;
    }

    public void setTreangleSideOne(double treangleSideOne) {
        this.treangleSideOne = treangleSideOne;
    }
    public double getArea(){
        double treangleArea = (heightSide*treangleSideOne)/2;
        return treangleArea;
    }
}
