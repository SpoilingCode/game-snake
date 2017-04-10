package game;

/**
 * Class calculates the quantity of points
 */
public class PointsHandler {

    private int quantityPoints ;

    public PointsHandler() {
        this.quantityPoints = 0;
    }

    public int getQuantityPoints() {
        return quantityPoints;
    }

    public int calculatePointsQuantity(){
        return ++quantityPoints;
    }
}
