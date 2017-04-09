package gameobjects;

import gameconstants.SnakeDirections;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class decribing snake object and its rendering
 */
public class Snake {

    private List<Point> snakeElements = new ArrayList<>();
    private Point point;
    private Point head;
    private int headX;
    private int headY;
    private int direction;
    private int length;
    private int x;
    private int y;

    public Snake(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void addPointInSnakeElements(){

        for(int i = 0; i < length  ; i++){
            point = new Point(x - i, y);
            snakeElements.add(point);
        }

    }

    public void paint(Graphics g){

       for(Point point : snakeElements){
           point.paint(g);
       }

    }

    public void startMove(){

      head = snakeElements.get(0);

      headX = head.getX();
      headY = head.getY();

      if( direction == SnakeDirections.RIGHT.getKeyCode() ||
          direction == SnakeDirections.D_RIGHT.getKeyCode()){
          headX++;
      }

      if( direction == SnakeDirections.LEFT.getKeyCode() ||
          direction == SnakeDirections.A_LEFT.getKeyCode() ){
          headX--;
      }

      if( direction == SnakeDirections.UP.getKeyCode() ||
          direction == SnakeDirections.W_UP.getKeyCode()  ){
          headY--;
      }

      if( direction == SnakeDirections.DOWN.getKeyCode() ||
          direction == SnakeDirections.S_DOWN.getKeyCode() ){
          headY++;
      }
        System.out.println("x: " + headX);
        System.out.println("y: " + headY);

      snakeElements.add(0, new Point(headX,headY));
      snakeElements.remove(snakeElements.size() - 1);
    }

    public boolean isExceedsScreenBorder(){
        int widthMargin = 58; // in points
        int heightMargin = 36;

        return(headX > widthMargin  ||
               headY > heightMargin ||
               headX < 0 || headY < 0);
    }
}
