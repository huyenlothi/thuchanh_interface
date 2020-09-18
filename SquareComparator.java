import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square sq1, Square sq2) {
        if (sq1.getArea() > sq2.getArea()) return 1;
        else if (sq1.getArea() < sq2.getArea()) return -1;
        else return 0;
    }
}
