package lab8;
/**
 * The {@code lab8.PointFactory} class
 * One more way to make copies
 */
public class PointFactory {
    private Point point;
    /**
     * Constructor of the {@link PointFactory} class, put point which you will to recreate to create one.
     * */
    public PointFactory(Point point) {
        this.point = point;
    }
    /**
     * {@link PointFactory#clonePoint(int)} method, put the digit referring the level of depth to copy the point.
     * */
    public Point clonePoint(int depth) {
        return (Point) point.clone(depth);
    }
}
