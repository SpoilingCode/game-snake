package gameconstants;

/**
 * Created by gerit on 08.04.2017.
 */
public enum WindowParameters {

    START_POSITION(200),
    FIELD_HEIGHT(20),
    FIELD_WIDTH(30),
    FIELD_DX(6),
    FIELD_DY(20),
    RADIUS_OF_CIRCLE(20),
    DELAY(150);

    private int value;

    WindowParameters(int value) {
        this.value = value;
    }
}
