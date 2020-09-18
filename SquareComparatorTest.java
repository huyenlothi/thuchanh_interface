import sun.text.resources.sq.JavaTimeSupplementary_sq;

import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(7);
        squares[1] = new Square(6);
        squares[2] = new Square(9);

        System.out.println("pre sort");
        for(Square square: squares){
            System.out.println(square);
        }

        Comparator squareComparator = new SquareComparator();
        Arrays.sort(squares, squareComparator);

        System.out.println("after sort");
        for(Square square : squares){
            System.out.println(square);
        }
    }
}
