package lab8;
/**
 * The {@code lab8.Point} class implement the {@link Clonable} interface
 * <p>
 * The point
 * This class provides an implementation of the {@link #clone(int)} method to preform a specific operation defined
 * in {@link Clonable#clone(int)}
 * </p>
 */
public class Point implements Clonable {
    private int x;
    private int y;
    String name;
    /**
     * Constructor of the {@link Point} class, put the 2d coordinates and name of the point to create one.
     * */
    public Point(int x, int y, String name) {

        this.x = x;
        this.y = y;
        this.name = name;
    }
    /**
     * {@link Point#clone(int)} method, put the digit referring the level of depth to copy the point.
     * */
    @Override
    public Object clone(int depth) {

        if (depth == 0){
            return new Point(this.x, this.y, this.name + 1);
        } else {
            return new Point(this.x, this.y, this.name);
        }

    }
    /**
     * {@link Point#toString()} method, converts class type data to String type data which is usefull for printing the information.
     * */
    @Override
    public String toString() {

        return "Point " + this.name + "(" + this.x + ", " + this.y + ")";
    }
}
