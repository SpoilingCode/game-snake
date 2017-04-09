package game;

import gameconstants.SnakeDirections;
import gameconstants.SnakeParameters;
import gameconstants.WindowParameters;
import gameobjects.*;
import gameview.KeyBoardListener;
import gameview.View;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.swing.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.awt.*;


/**
 * Class for launch game
 */
public class GameCore {

    private JFrame gameWindow;
    private View view;
    private KeyBoardListener keyBoardListener;
    private Snake snake;

    public static void main(String[] args) {
        GameCore gameCore = new GameCore();
        gameCore.startGame();

    }

    public void startGame(){
      gameWindow = new JFrame("Game Snake");
      gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
      gameWindow.setSize( WindowParameters.WINDOW_WIDTH.getValue(),
                          WindowParameters.WINDOW_HEIGHT.getValue());
      gameWindow.setResizable(false);
      gameWindow.setLocation( SnakeParameters.START_POSITION.getValue(),
                              SnakeParameters.START_POSITION.getValue());

      snake = new Snake( SnakeParameters.START_POSITION_OF_SNAKE_ON_X.getValue(),
                         SnakeParameters.START_POSITION_OF_SNAKE_ON_Y.getValue());
      snake.setDirection(SnakeDirections.RIGHT.getKeyCode());
      snake.setLength(SnakeParameters.SNAKE_LENGTH.getValue());
      snake.addPointInSnakeElements();

      view = new View(snake);
      view.setBackground(Color.BLUE);
      gameWindow.getContentPane().add(BorderLayout.CENTER, view);
      gameWindow.setVisible(true);
      keyBoardListener = new KeyBoardListener();
      keyBoardListener.setSnake(snake);
      gameWindow.addKeyListener(keyBoardListener);
      gameWindow.setLocationRelativeTo(null);
      boolean gameOver = false;

      while (!gameOver){
          snake.startMove();
          view.repaint();
          makeDelay();
      }

    }

    public void makeDelay(){
        try{
            Thread.sleep(WindowParameters.DELAY.getValue());
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public boolean isGameOver(){
       return false;
    }
}

