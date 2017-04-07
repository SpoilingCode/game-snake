package gameconstants;

/**
 * Created by gerit on 08.04.2017.
 */
public enum SnakeParameters {

    START_POSITION_OF_SNAKE_ON_X(10),
    START_POSITION_OF_SNAKE_ON_Y(10),
    SNAKE_LENGTH(8);

    private int value;

    SnakeParameters(int value) {
        this.value = value;
    }
}
