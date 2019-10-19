import abs.Shape;
import circle.Circle;
import square.Square;
import treangle.Treangle;

import java.security.spec.RSAOtherPrimeInfo;

public class ApplicationRunner {
    public static void main(String[] args) {

        Treangle treangle = new Treangle();
        treangle.setTreangleSideOne(10);
        treangle.setHeightSide(27 );

        Circle circle = new Circle();
        circle.setRadius(21);

        Square square = new Square();
        square.setSideSquare(10);

        Shape maxAreaS;
        if (treangle.getArea() > circle.getArea()) {
            maxAreaS = treangle;
        } else {
            maxAreaS = circle;
        }
        if (maxAreaS.getArea() < square.getArea()) {
            maxAreaS = square;
        }
        System.out.println("MAX shape "+ maxAreaS.getClass().getSimpleName()+ "  and has area "+maxAreaS.getArea());

        Shape minAreaS;
        if(treangle.getArea() >circle.getArea()){
            minAreaS = circle;
        }else {
            minAreaS = treangle;
        }if(minAreaS.getArea() > square.getArea()){
            minAreaS = square;
        }
        System.out.println("MIN  shape "+ minAreaS.getClass().getSimpleName()+ "  and has area "+minAreaS.getArea());



       /* Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println("CIRCLE: " + circle.getArea());

        Treangle treangle = new Treangle();
        treangle.setHeightSide(110);
        treangle.setTreangleSideOne(20);
        System.out.println("TREANGLE: " + treangle.getArea());

        Square square = new Square();
        square.setSideSquare(10);
        System.out.println("SQUARE: " + square.getArea());


        if (circle.getArea() > treangle.getArea() && circle.getArea() > square.getArea()) {
            System.out.println("Max value area share =  CIRCLE: " + circle.getArea());
        } else if (treangle.getArea() > circle.getArea() && treangle.getArea() < square.getArea()) {
            System.out.println("Max value area share = SQUARE:  " + square.getArea());
        } else if (treangle.getArea() > circle.getArea() && treangle.getArea() > square.getArea()) {
            System.out.println("Max value area share = TREANGLE:  " + treangle.getArea());
        } else if (circle.getArea() == treangle.getArea()) {
            System.out.println("Value max area  CIRCLE and TREANGLE ");
        } else if (circle.getArea() == square.getArea()) {
            System.out.println("Value max area  CIRCLE and SQUARE ");
        } else {
            System.out.println("Value max area SQUARE and TREANGLE ");
        }*/

    }

}

