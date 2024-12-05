public class Square extends Rectangle{


    public Square(Point center, double length){
        super(center, length, length);
    }

    @Override
    public void setWidth(double width) { //override the setWidth method to change the height as well
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) { //override to change the width as well
        this.setWidth(height);
    }


}
