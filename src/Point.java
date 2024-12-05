public class Point {
    private double x;
    private double y;

    public Point(double x, double y) { //constructor for the point
        this.x = x;
        this.y = y;
    }

    //returns x
    public double getX() {
        return x;
    }

    //returns y
    public double getY() {
        return y;
    }

    //sets this x to x
    public void setX(double x) {
        this.x = x;
    }

    //sets this x to x
    public void setY(double y) {
        this.y = y;
    }

    //rotates this point about point p at a certain angle
    public void rotateAbout(Point p, double angle) {
        double originX = this.x - p.getX(); //input X as the origin
        double originY = this.y - p.getY(); //input Y as the origin
        this.x = (originX * Math.cos(angle) - originY * Math.sin(angle)) + p.getX(); //rotates x about input x
        this.y = (originX * Math.sin(angle) + originY * Math.cos(angle)) + p.getY(); //rotates y about input y
    }


}
