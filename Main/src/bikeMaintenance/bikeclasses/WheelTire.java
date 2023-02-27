package bikemaintenance.bikeclasses;

public class WheelTire extends BikePart{
    private boolean isTubeless;
    private boolean isFront;
    private int sealantAgeInDays;

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

    public int getSealantAgeInDays() {
        return sealantAgeInDays;
    }

    public void setSealantAgeInDays(int sealantAgeInDays) {
        this.sealantAgeInDays = sealantAgeInDays;
    }
}
