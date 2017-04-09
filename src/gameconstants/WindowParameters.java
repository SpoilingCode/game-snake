package gameconstants;

/**
 * Class for specific the values of the game window
 */
public enum WindowParameters {

    WINDOW_WIDTH(800),
    WINDOW_HEIGHT(600),
    RADIUS_OF_POINT(10),
    DELAY(80);

    private int value;

    public int getValue() {
        return value;
    }

    WindowParameters(int value) {
        this.value = value;
    }
}
