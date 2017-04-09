package gameconstants;

/**
 * Class contains key code for moving the snake
 */
public enum SnakeDirections {

    LEFT(37),
    RIGHT(39),
    UP(38),
    DOWN(40),
    W_UP(87),
    S_DOWN(83),
    A_LEFT(65),
    D_RIGHT(68);

    private int keyCode;

    SnakeDirections(int keyCode) {
        this.keyCode = keyCode;
    }

    public int getKeyCode() {
        return keyCode;
    }
}
