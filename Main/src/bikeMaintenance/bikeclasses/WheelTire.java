package bikemaintenance.bikeclasses;

public class WheelTire extends BikePart{
    private boolean isTubeless;
    private boolean isFront;

    public boolean isTubeless() {
        return isTubeless;
    }

    public void setTubeless(boolean tubeless) {
        isTubeless = tubeless;
    }

    public boolean isFront() {
        return isFront;
    }

    public void setFront(boolean front) {
        isFront = front;
    }

}
