package gameview;

import directions.DirectionListener;
import gameconstants.SnakeParameters;
import gameconstants.WindowParameters;
import gameobjects.Product;
import gameobjects.Snake;

import javax.swing.*;
import java.awt.*;

/**
 * Class for drawing window the game
 */
public class View extends JPanel{

    private Snake snake;
    private Product product;
    private JFrame gameWindow;
    private View view;
    private DirectionListener directionListener;

    public void setDirectionListener(DirectionListener directionListener) {
        this.directionListener = directionListener;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        snake.paint(g);
        product.paint(g);
    }

    public JFrame getGameWindow() {
        return gameWindow;
    }

    public void drawWindow(){
     gameWindow = new JFrame("Game Snake " );
     gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
     gameWindow.setSize( WindowParameters.WINDOW_WIDTH.getValue(),
                         WindowParameters.WINDOW_HEIGHT.getValue());
     gameWindow.setResizable(false);
     gameWindow.setLocation( SnakeParameters.START_POSITION.getValue(),
                             SnakeParameters.START_POSITION.getValue());
     setBackground(Color.BLUE);
     gameWindow.getContentPane().add(BorderLayout.CENTER, view);
     gameWindow.addKeyListener(directionListener);

     gameWindow.setVisible(true);
     gameWindow.setLocationRelativeTo(null);
    }
}
