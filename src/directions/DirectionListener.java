package directions;

import gameobjects.Snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Class for controlling the snake using the keys
 */
public class DirectionListener extends KeyAdapter {

    private Snake snake;

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        snake.setDirection(e.getKeyCode());
    }
}
