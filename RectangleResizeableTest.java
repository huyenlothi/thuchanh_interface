public class RectangleResizeableTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(4,7);
        rectangles[1] = new Rectangle(9,14);
        rectangles[2] = new Rectangle(43,5);

        System.out.println("pre-Resize");
        for (Rectangle rectangle1: rectangles){
            System.out.println(rectangle1.getArea());
        }
        for( Rectangle rectangle1 : rectangles){
            Resizeable rectangleResizeable = new RectangleResizeable(rectangle1);
            rectangleResizeable.getresize(10);
        }
        System.out.println("after resize");
        for( Rectangle rectangle1: rectangles){
            System.out.println(rectangle1.getArea());
        }

    }
}
