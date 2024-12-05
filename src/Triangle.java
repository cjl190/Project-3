public class Triangle extends Polygon {

    private Point p1, p2, p3; //points of the triangle

    public Triangle(Point p1, Point p2, Point p3) {
        super(new Point[]{p1, p2, p3});
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public Point getCenter(){ //returns the center by calculating from the midpoints
        Point midPoint1 = new Point((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);
        Point midPoint2 = new Point((p2.getX() + p3.getX()) / 2, (p2.getY() + p3.getY()) / 2);

        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = midPoint2.getX();
        double y2 = midPoint2.getY();
        double x3 = p3.getX();
        double y3 = p3.getY();
        double x4 = midPoint1.getX();
        double y4 = midPoint1.getY();

        double denominator = ((x1-x2)*(y3-y4) - (y1-y2)*(x3-x4));

        return new Point(((x1*y2 - y1*x2)*(x3-x4) - (x1-x2)*(x3*x4 - y3*x4)) / denominator, ((x1*y2 - y1*x2)*(y3-y4) - (y1-y2)*(x3*x4 - y3*x4)) / denominator);

    }

    @Override //moves the triangle according to the new center
    public void setCenter(Point center) {
        //translate the points
        p1.setX((center.getX() - this.getCenter().getX()) + p1.getX());
        p1.setY((center.getY() - this.getCenter().getY()) + p1.getY());

        p2.setX((center.getX() - this.getCenter().getX()) + p2.getX());
        p2.setY((center.getY() - this.getCenter().getY()) + p2.getY());

        p3.setX((center.getX() - this.getCenter().getX()) + p3.getX());
        p3.setY((center.getY() - this.getCenter().getY()) + p3.getY());

        //move the center
        this.getCenter().setX(center.getX());
        this.getCenter().setY(center.getY());
    }


}
