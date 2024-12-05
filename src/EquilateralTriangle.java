public class EquilateralTriangle extends Polygon implements NGon {

    private double length;
    public EquilateralTriangle(Point center, double length) {
        super(new Point[]{new Point(length / Math.sqrt(3.0) + center.getX(), center.getY()), new Point(length / Math.sqrt(3.0) * Math.cos(2 * Math.PI / 3) + center.getX(), length / Math.sqrt(3.0) * Math.sin(2 * Math.PI / 3) + center.getY()), new Point(length / Math.sqrt(3.0) * Math.cos(-2 * Math.PI / 3) + center.getX(), length / Math.sqrt(3.0) * Math.sin(-2 * Math.PI / 3) + center.getY())});
        this.setCenter(center);
        this.length = length;
    }

    @Override
    public double getSidelength() { //return the side length
        return this.length;
    }

    @Override
    public int getNumSides() { //return number of sides
        return 3;
    }

    @Override
    public void setSidelength(double s) { //set the side length to input
        this.length = s;
    }
}
