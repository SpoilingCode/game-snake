package gameconstants;

/**
 * Class for specific the values of the snake
 */
public enum SnakeParameters {

    START_POSITION(200),
    START_POSITION_OF_SNAKE_ON_X(7),
    START_POSITION_OF_SNAKE_ON_Y(7),
    SNAKE_LENGTH(8);

    private int value;

    SnakeParameters(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
