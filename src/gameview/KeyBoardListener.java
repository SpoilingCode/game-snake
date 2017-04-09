package gameview;

import gameobjects.Snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Class for controlling the snake using the keys
 */
public class KeyBoardListener extends KeyAdapter {

    private Snake snake;

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        snake.setDirection(e.getKeyCode());
    }
}
