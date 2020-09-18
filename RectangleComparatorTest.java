import com.sun.org.apache.regexp.internal.RE;
import sun.plugin.dom.css.Rect;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(3, 6);
        rectangles[1] = new Rectangle(2, 7);
        rectangles[2] = new Rectangle(5, 7);

        System.out.println(" pre-sort");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);

        System.out.println("After sort");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
