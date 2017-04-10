package game;

import directions.DirectionListener;
import directions.SnakeDirections;
import gameconstants.SnakeParameters;
import gameconstants.WindowParameters;
import gameobjects.*;
import gameview.View;

/**
 * Class for launch game
 */
public class GameCore {

    private View view;
    private DirectionListener directionListener;
    private Snake snake;
    private Product product;
    private PointsHandler pointsHandler;

    public static void main(String[] args) {
        GameCore gameCore = new GameCore();
        gameCore.startGame();
    }

    public void startGame(){
      int startPositionX = SnakeParameters.START_POSITION_OF_SNAKE_ON_X.getValue();
      int startPositionY = SnakeParameters.START_POSITION_OF_SNAKE_ON_Y.getValue();
      snake = new Snake( startPositionX, startPositionY);
      snake.setDirection(SnakeDirections.RIGHT.getKeyCode());
      snake.setLength(SnakeParameters.SNAKE_LENGTH.getValue());
      snake.addPointInSnakeElements();

      view = new View();
      view.setSnake(snake);
      directionListener = new DirectionListener();
      directionListener.setSnake(snake);

      view.setDirectionListener(directionListener);
      view.setView(view);
      view.drawWindow();

      product = new Product();
      product.setSnake(snake);

      view.setProduct(product);
      pointsHandler = new PointsHandler();

      snake.setProduct(product);
      snake.setPointsHandler(pointsHandler);
      boolean gameEnd = false;
      String gameEndMessage = "GAME OVER! ";
      String quantityPointsMessage = "  Quantity points: ";

      while (!gameEnd) {
          snake.startMove();

          if (product.isEaten()) {
              product.showNext();
          }
          view.repaint();
          makeDelay();

          if (snake.isExceedsScreenBorder()) {
              view.getGameWindow().
                   setTitle(gameEndMessage + quantityPointsMessage +
                            pointsHandler.getQuantityPoints());
              gameEnd = true;
          }
      }
    }

    public void makeDelay(){
        try{
            Thread.sleep(WindowParameters.DELAY.getValue());
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}

