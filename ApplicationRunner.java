import circle.Circle;
import square.Square;
import treangle.Treangle;

public class ApplicationRunner {
    public static void main(String[] args) {

        Circle circle = new Circle();
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
        } else if(treangle.getArea() > circle.getArea()&& treangle.getArea()> square.getArea()){
            System.out.println("Max value area share = TREANGLE:  " + treangle.getArea());
        }else if (circle.getArea() == treangle.getArea()) {
            System.out.println("Value max area  CIRCLE and TREANGLE ");
        }else if(circle.getArea() == square.getArea()){
            System.out.println("Value max area  CIRCLE and SQUARE ");
        }else {
            System.out.println("Value max area SQUARE and TREANGLE ");
        }

    }

}

