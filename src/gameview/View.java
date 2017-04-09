package gameview;

import gameconstants.SnakeParameters;
import gameconstants.WindowParameters;
import gameobjects.Snake;

import javax.swing.*;
import java.awt.*;

/**
 * Class for drawing window the game
 */
public class View extends JPanel{

    private Snake snake;
    private JFrame gameWindow;
    private View view;
    private KeyBoardListener keyBoardListener;

    public void setKeyBoardListener(KeyBoardListener keyBoardListener) {
        this.keyBoardListener = keyBoardListener;

    }

    public void setView(View view) {
        this.view = view;
    }

    public View(){

    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        snake.paint(g);
    }

    public JFrame getGameWindow() {
        return gameWindow;
    }

    public void drawWindow(){

     gameWindow = new JFrame("Game Snake");
     gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
     gameWindow.setSize( WindowParameters.WINDOW_WIDTH.getValue(),
                         WindowParameters.WINDOW_HEIGHT.getValue());
     gameWindow.setResizable(false);
     gameWindow.setLocation( SnakeParameters.START_POSITION.getValue(),
                             SnakeParameters.START_POSITION.getValue());
     setBackground(Color.BLUE);
     gameWindow.getContentPane().add(BorderLayout.CENTER, view);
     gameWindow.addKeyListener(keyBoardListener);

     gameWindow.setVisible(true);
     gameWindow.setLocationRelativeTo(null);
    }
}
