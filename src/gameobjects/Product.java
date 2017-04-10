package gameobjects;

import gameconstants.WindowParameters;


import java.awt.*;
import java.util.Random;

/**
 * Class for description of food of a snake
 */
public class Product extends Point{

    private Random random ;
    private Snake snake;

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Product(){
        super(-10, -10);
        this.color = Color.YELLOW;
    }

    public boolean isEaten(){
        return this.getX() < 0 && this.getY() < 0;
    }

    public void hide(){
        this.setX(-10);
        this.setY(-10);
    }

    public void followingProduct(){
        random = new Random();
        do {
            this.setX(random.nextInt(WindowParameters.MARGIN_WIDTH.getValue()));
            this.setY(random.nextInt(WindowParameters.MARGIN_HEIGHT.getValue()));
        }while(snake.isProductInsideTheSnake(this.getX(),this.getY()));

    }

}
