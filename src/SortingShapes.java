import java.util.*;

public class SortingShapes implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        int areaComparison = Double.compare(o1.getArea(), o2.getArea());
        if (areaComparison != 0)
            return areaComparison;
        return Double.compare(o1.getPerimeter(), o2.getPerimeter());
    }
}