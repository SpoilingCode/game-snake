package game;

import gameconstants.SnakeDirections;
import gameconstants.SnakeParameters;
import gameconstants.WindowParameters;
import gameobjects.*;
import gameview.KeyBoardListener;
import gameview.View;

/**
 * Class for launch game
 */
public class GameCore {

    private View view;
    private KeyBoardListener keyBoardListener;
    private Snake snake;

    public static void main(String[] args) {
        GameCore gameCore = new GameCore();
        gameCore.startGame();
    }

    public void startGame(){

      snake = new Snake( SnakeParameters.START_POSITION_OF_SNAKE_ON_X.getValue(),
                         SnakeParameters.START_POSITION_OF_SNAKE_ON_Y.getValue());
      snake.setDirection(SnakeDirections.RIGHT.getKeyCode());
      snake.setLength(SnakeParameters.SNAKE_LENGTH.getValue());
      snake.addPointInSnakeElements();

      view = new View();
      view.setSnake(snake);
      keyBoardListener = new KeyBoardListener();
      keyBoardListener.setSnake(snake);
      view.setKeyBoardListener(keyBoardListener);
      view.setView(view);
      view.drawWindow();

        while (!isGameOver()){
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

