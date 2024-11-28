import lab8.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2, "A");
        Point p2 = new Point(3, 4, "B");
        Point p3 = (Point)p1.clone(0);
        Point p4 = (Point)p2.clone(1);
        Point p5 = new PointFactory(p3).clonePoint(1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        List<Point> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        Line line = new Line(points, "Line");
        System.out.println(line);
        Line line2 = (Line)line.clone(0);
        System.out.println(line2);
        Line line3 = (Line)line2.clone(1);
        System.out.println(line3);

    }
}