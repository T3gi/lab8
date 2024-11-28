package lab8;

import java.util.ArrayList;
import java.util.List;
/**
 * The {@code lab8.Line} class implement the {@link Clonable} interface
 * <p>
 * The line
 * This class provides an implementation of the {@link #clone(int)} method to preform a specific operation defined
 * in {@link Clonable#clone(int)}
 * </p>
 */
public class Line implements Clonable{
    private List<Point> points = new ArrayList<>();
    String name;
    /**
     * {@link Line#addPoint(Point)} method, put the point to add to the points from which this line need to consist.
     * */
    public void addPoint(Point p) {
        points.add(p);
    }
    /**
     * {@link Line#removePoint(Point)} method, put the point to remove one of the points from which this line need to consist.
     * */
    public void removePoint(Point p) {
        points.remove(p);
    }
    /**
     * Constructor of the {@link Line} class, put the list of the points to create one.
     * */
    public Line(List<Point> points, String name) {
        this.points = points;
        this.name = name;
    }
    /**
     * {@link Line#clone(int)} method, put the digit referring the level of depth to copy the point.
     * */
    @Override
    public Object clone(int depth) {
        if (depth == 0){
            return new Line(this.points, this.name + 1);
        } else {
            return new Line(this.points, this.name);
        }

    }
    /**
     * {@link Line#toString()} method, converts class type data to String type data which is usefull for printing the information.
     * */
    @Override
    public String toString() {
        return this.name + " from " + this.points.getFirst().toString() + " to " + this.points.getLast().toString();
    }
}
