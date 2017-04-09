package gameobjects;

import gameconstants.WindowParameters;

import java.awt.*;

/**
 * Class decribing point with coordinate and its rendering
 */
public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
      this.setX(x);
      this.setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillOval(x * WindowParameters.RADIUS_OF_POINT.getValue(), y * WindowParameters.RADIUS_OF_POINT.getValue(),
                       WindowParameters.RADIUS_OF_POINT.getValue(), WindowParameters.RADIUS_OF_POINT.getValue());
    }
}
