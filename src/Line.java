public class Line  {

    private Point first; //first and second points
    private Point second;
    private double x1; //x and y coordinates
    private double y1;
    private double x2;
    private double y2;

    public Line(Point first, Point second) { //instantiate with points
        this.first = first;
        this.second = second;
        this.x1 = first.getX();
        this.y1 = first.getY();
        this.x2 = second.getX();
        this.y2 = second.getY();
    }

    public Line(double x1, double y1, double x2, double y2) { //instantiate with coordinates
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.first = new Point(x1, y1);
        this.second = new Point(x2, y2);
    }
    public Point getFirstPoint() { //return first point
        return first;
    }

    public Point getSecondPoint() { //return second point
        return second;
    }

    public void setFirstPoint(Point p) { //set first point to input
        this.first = p;
    }

    public void setSecondPoint(Point p2) { //set second point to input
        this.second = p2;
    }

    public Line[] getLines() { //return array of the Line
        return new Line[]{this};
    }
}
