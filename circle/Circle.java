package circle;

import abs.AbstractClass;

public class Circle extends AbstractClass {
   private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double getAreaCircle = Math.PI*(radius * radius);
        return getAreaCircle;
    }


}
