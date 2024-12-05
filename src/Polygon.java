public abstract class Polygon {

    Point[] points; //array of the points on the
    Point center; //center of the polygon
    public Polygon(Point[] points) {
        if (points.length < 3) { //since a polygon has to have at least 3 points, any less would be a line or point. so we throw an exception here
            throw new IllegalArgumentException("Polygon must have at least 3 points");
        }
        this.points = points;
        this.center = new Point(0, 0);
    }

    public Point getCenter(){ //returns the center by calculating it from the points
        double centerX = 0.0;
        double centerY = 0.0;
        double left = points[0].getX();
        double right = points[0].getX();
        double top = points[0].getY();
        double bottom = points[0].getY();
        for(int i = 1; i < points.length; i++){ //finds leftmost x-point
            if(points[i].getX() < left){
                left = points[i].getX();
            }
        }
        for(int i = 1; i < points.length; i++){ //finds rightmost x-point
            if(points[i].getX() > right){
                right = points[i].getX();
            }
        }
        for(int i = 1; i < points.length; i++){ //finds highest y-point
            if(points[i].getY() > top){
                top = points[i].getY();
            }
        }
        for(int i = 1; i < points.length; i++){ //find lowest y-point
            if(points[i].getY() < bottom){
                bottom = points[i].getY();
            }
        }

        centerX = (left + right) / 2.0;
        centerY = (top + bottom) / 2.0;
        this.center.setY(centerY);
        this.center.setX(centerX);
        return center;
    }

    public void setCenter(Point newCenter){ //sets the center to the input and changes the points to the center
        for(int i = 0; i < points.length; i++){ //translate the points
            points[i].setX((newCenter.getX() - this.center.getX()) + points[i].getX());
            points[i].setY((newCenter.getY() - this.center.getY()) + points[i].getY());
        }

        this.center.setX(newCenter.getX());
        this.center.setY(newCenter.getY());
    }

    public void rotate(double angle){
        for(int i = 0; i < points.length; i++){
            points[i].rotateAbout(center, angle);
        }
    }

    public Point[] getPoints(){
        return points;
    }

    public Line[] getLines(){
        Line[] lines = new Line[points.length]; //lines from top left going clockwise
        for(int i = 0; i < points.length; i++){
            if(i == points.length - 1){
                lines[i] = new Line(points[i], points[0]);
            }
            else lines[i] = new Line(points[i], points[i+1]);
    }
    return lines;
    }
}
