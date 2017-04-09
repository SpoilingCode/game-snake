package gameview;

import gameobjects.Snake;

import javax.swing.*;
import java.awt.*;

/**
 * Class for drawing
 */
public class View extends JPanel{

    private Snake snake;

    public View(Snake snake){
        this.snake = snake;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        snake.paint(g);
    }

    public void drawing(){

    }
}
