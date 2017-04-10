package gameconstants;

/**
 * Class for specific the values of the game window
 */
public enum WindowParameters {

    WINDOW_WIDTH(600),
    WINDOW_HEIGHT(400),
    MARGIN_WIDTH(58),
    MARGIN_HEIGHT(36),
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
