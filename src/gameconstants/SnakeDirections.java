package gameconstants;

/**
 * Created by gerit on 08.04.2017.
 */
public enum SnakeDirections {

    LEFT(37),
    RIGHT(39),
    UP(38),
    DOWN(40);

    private int keyCode;

    SnakeDirections(int keyCode) {
        this.keyCode = keyCode;
    }
}
