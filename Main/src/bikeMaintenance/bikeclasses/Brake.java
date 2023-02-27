package bikemaintenance.bikeclasses;

public class Brake extends BikePart{
    private String padType;
    private boolean isFront;

    public String getPadType() {
        return padType;
    }

    public void setPadType(String padType) {
        this.padType = padType;
    }

    public boolean isFront() {
        return isFront;
    }

    public void setFront(boolean front) {
        isFront = front;
    }
}
