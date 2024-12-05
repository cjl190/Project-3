public class Rectangle extends Polygon{

    private double width; //width of the rectangle
    private double height; //height of the rectangle

    public Rectangle(Point center, double width, double height) { //constructor for Rectangle with its center, width, and height
        super(  new Point[]{new Point(center.getX() - width / 2, center.getY() + height / 2), //top left
                            new Point(center.getX() + width / 2, center.getY() + height / 2), //top right
                            new Point(center.getX() + width / 2.0, center.getY() - height / 2.0), //bottom right
                            new Point(center.getX() - width / 2.0, center.getY() - height / 2.0)}); //bottom left
        //above line calls the super class and puts an array of Points in the parameter, the 4 corners
        super.setCenter(center);
        this.width = width;
        this.height = height;
    }

    public double getWidth() { //returns the width
        return width;
    }

    public double getHeight() { //returns the height
        return height;
    }

    public void setWidth(double width) { //sets the width to the input
        this.width = width;
        updatePoints();
    }

    public void setHeight(double height) { //sets the height to the input
        this.height = height;
        updatePoints();
    }

    @Override
    public Point getCenter() {
      return center;
    }

    private void updatePoints() {
        //recalculate the points based on the current center, width, and height
        Point center = getCenter();
        for(int i = 0; i < points.length; i++) {
            if(i == 0){
                points[0].setX(center.getX() - width / 2);
                points[0].setY(center.getY() + height / 2);
            }
            if(i == 1){
                points[1].setX(center.getX() + width / 2);
                points[1].setY(center.getY() + height / 2);
            }
            if(i == 2){
                points[2].setX(center.getX() + width / 2);
                points[2].setY(center.getY() - height / 2);
            }
            if(i == 3){
                points[3].setX(center.getX() - width / 2);
                points[3].setY(center.getY() - height / 2);
            }
        }
    };


}
