public class CircleResizeableTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(2);
        circle[1] = new Circle(10);
        circle[2] = new Circle(15);

        System.out.println("pre-resizeable");
        for(Circle circle1: circle){
            System.out.println(circle1.getArea());
        }
        for (Circle circle1: circle){
            Resizeable circleResizeable = new CircleResizeable(circle1);
            circleResizeable.getresize(30);

        }


        System.out.println("after resizeable");
        for(Circle circle1: circle){
            System.out.println(circle1.getArea());
        }


    }
}
